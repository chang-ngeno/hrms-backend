package changsoft.hrms.core.adapters.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import changsoft.hrms.business.constants.MessageResults;
import changsoft.hrms.core.adapters.abstracts.ImageUploadService;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.ErrorDataResult;
import changsoft.hrms.core.utilities.results.SuccessDataResult;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CloudinaryServiceAdapter implements ImageUploadService {

    private final Cloudinary cloudinary;

    public CloudinaryServiceAdapter(){
        Map<String, String> config = new HashMap<>();
        config.put("cloud_name", "drma0wotu");
        config.put("api_key", "853188371446736");
        config.put("api_secret", "ef13HxFsFp-_bF2w_VoepOELSys");
        cloudinary = new Cloudinary(config);
    }

    public DataResult<Map<String, String>> upload(MultipartFile multiPartFile) {
        File file;

        try{
            file = convert(multiPartFile);
            Map<String, String> result = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
            file.delete();
            return new SuccessDataResult<Map<String, String>>(result);
        }
        catch (IOException exception){
            exception.printStackTrace();
            return new ErrorDataResult<Map<String, String>>(MessageResults.errorWhileUploadingFile);
        }
    }

    public DataResult<Map> delete (String id) throws IOException {
        Map result = cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
        return new SuccessDataResult<Map>(result);
    }

    private File convert(MultipartFile multipartFile) throws IOException {
        File file = new File(multipartFile.getOriginalFilename());
        FileOutputStream stream = new FileOutputStream(file);
        stream.write(multipartFile.getBytes());
        stream.close();
        return file;
    }
}
