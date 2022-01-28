package changsoft.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import changsoft.hrms.business.abstracts.ImageService;
import changsoft.hrms.business.abstracts.ResumeService;
import changsoft.hrms.business.constants.MessageResults;
import changsoft.hrms.core.adapters.abstracts.ImageUploadService;
import changsoft.hrms.core.adapters.concretes.CloudinaryServiceAdapter;
import changsoft.hrms.core.utilities.results.*;
import changsoft.hrms.dataAccess.abstracts.ImageDao;
import changsoft.hrms.entities.concretes.Image;
import changsoft.hrms.entities.concretes.Resume;
import changsoft.hrms.entities.dtos.image.ImageSaveDto;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageManager implements ImageService {
    private final ImageDao imageDao;
    private final ResumeService resumeService;
    private final String FIELD = "image";

    private final ImageUploadService imageUploadService = new CloudinaryServiceAdapter();


    @Autowired
    public ImageManager(ImageDao imageDao, ResumeService resumeService){
        this.imageDao = imageDao;
        this.resumeService = resumeService;
    }

    //Get
    public DataResult<List<Image>> getAll() {
        return new SuccessDataResult<List<Image>>(this.imageDao.findAll(), MessageResults.allDataListed(FIELD));
    }

    public DataResult<List<Image>> getAllByResumeId(int resumeId) {
        return new SuccessDataResult<List<Image>>(this.imageDao.getAllByResume_Id(resumeId), MessageResults.allDataListed(FIELD));
    }

    public DataResult<Image> getById(int id) {
        return new SuccessDataResult<Image>(this.imageDao.findById(id).get(), MessageResults.dataListed(FIELD));
    }

    public DataResult<List<Image>> getByIds(List<Integer> ids) {
        List<Image> images = new ArrayList<>();

        for(var id : ids){
            DataResult<Image> imageDataResult = getById(id);
            if(imageDataResult.isSuccess()){
                images.add(imageDataResult.getData());
            }
        }

        return new SuccessDataResult<List<Image>>(images, MessageResults.allDataListed(FIELD));
    }

    //Save
    public Result save(int resumeId, MultipartFile file) {
        DataResult<Resume> resume = resumeService.getById(resumeId);

        if(!resume.isSuccess()){
            return new ErrorResult(MessageResults.notFound(FIELD));
        }

        var uploadedImage = imageUploadService.upload(file);

        if(!uploadedImage.isSuccess()){
            return new ErrorResult(MessageResults.errorWhileUploadingFile);
        }

        Image imageObject = new Image(
                resume.getData(),
                uploadedImage.getData().get("url")
        );

        this.imageDao.save(imageObject);
        return new SuccessResult(MessageResults.saved(FIELD));
    }

    public Result delete(Image image) {
        this.imageDao.delete(image);
        return new SuccessResult(MessageResults.deleted(FIELD));
    }

    public Result deleteById(int id) {
        this.imageDao.deleteById(id);
        return new SuccessResult(MessageResults.deleted(FIELD));
    }

    public Result deleteByIds(List<Integer> ids) {
        for (int id : ids){
            this.imageDao.deleteById(id);
        }
        return new SuccessResult(MessageResults.deleteds(FIELD));
    }

    public Result deleteAll(List<Image> images) {
        for (var image : images){
            this.imageDao.deleteById(image.getId());
        }
        return new SuccessResult(MessageResults.deleteds(FIELD));
    }
}
