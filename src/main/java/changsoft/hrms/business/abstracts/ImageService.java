package changsoft.hrms.business.abstracts;


import org.springframework.web.multipart.MultipartFile;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Image;
import changsoft.hrms.entities.dtos.image.ImageSaveDto;

import java.util.List;

public interface ImageService {
    //Get
    DataResult<List<Image>> getAll();
    DataResult<List<Image>> getAllByResumeId(int resumeId);
    DataResult<Image> getById(int id);
    DataResult<List<Image>> getByIds(List<Integer> ids);

    //Post
    Result save(int resumeId, MultipartFile file);

    //Delete
    Result delete(Image image);
    Result deleteById(int id);
    Result deleteByIds(List<Integer> ids);
    Result deleteAll(List<Image> images);
}
