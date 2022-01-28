package changsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import changsoft.hrms.business.abstracts.ResumeService;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Resume;
import changsoft.hrms.entities.dtos.resume.ResumeSaveDto;
import changsoft.hrms.entities.dtos.resume.ResumeUpdateDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/resumees")
@CrossOrigin
public class ResumeesController {
    private ResumeService resumeService;

    @Autowired
    public ResumeesController(ResumeService resumeService){
        this.resumeService = resumeService;
    }

    //Get
    @GetMapping("")
    public DataResult<List<Resume>> getAll() {
        return this.resumeService.getAll();
    }

    @GetMapping("/{id}")
    public DataResult<Resume> getById(@PathVariable(value = "id") int id) {
        return this.resumeService.getById(id);
    }

    @GetMapping("/getByEmployeeId")
    public DataResult<Resume> getByEmployeeId(@RequestParam(value = "employeeId") int employeeId) {
        return this.resumeService.getByEmployeeId(employeeId);
    }

    //Post
    @PostMapping("")
    public Result save(@Valid @RequestBody ResumeSaveDto resume){
        return this.resumeService.save(resume);
    }

    //Put
    @PutMapping("")
    public Result updateById(@RequestBody ResumeUpdateDto resume){
        return this.resumeService.updateById(resume);
    }

    //Delete
    @DeleteMapping("")
    public Result delete(@RequestBody Resume resume){
        return this.resumeService.delete(resume);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable(value = "id") int id){
        return this.resumeService.deleteById(id);
    }
}
