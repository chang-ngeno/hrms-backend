package changsoft.hrms.core.adapters.abstracts;

import org.springframework.web.multipart.MultipartFile;

import changsoft.hrms.core.utilities.results.DataResult;

import java.io.IOException;
import java.util.Map;

public interface ImageUploadService {
    DataResult<Map<String, String>> upload(MultipartFile file);
    DataResult<Map> delete(String id) throws IOException;
}
