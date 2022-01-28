package changsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import changsoft.hrms.business.abstracts.ImageService;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Image;
import changsoft.hrms.entities.dtos.image.ImageSaveDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/images")
@CrossOrigin
public class ImagesController {
    private final ImageService imageService;

    @Autowired
    public ImagesController(ImageService imageService){
        this.imageService = imageService;
    }

    //Get
    @GetMapping("")
    public DataResult<List<Image>> getAll() {
        return this.imageService.getAll();
    }

    @GetMapping("/getAllByResumeId")
    public DataResult<List<Image>> getAllByResumeId(int resumeId) {
        return this.imageService.getAllByResumeId(resumeId);
    }

    @GetMapping("/{id}")
    public DataResult<Image> getById(@PathVariable(value = "id") int id) {
        return this.imageService.getById(id);
    }


    //Post
    @PostMapping("")
    public Result save(@RequestParam int resumeId, @RequestBody MultipartFile file){
        return this.imageService.save(resumeId, file);
    }


    //Delete
    @DeleteMapping("")
    public Result delete(@RequestBody Image image){
        return this.imageService.delete(image);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable(value = "id") int id){
        return this.imageService.deleteById(id);
    }
}
