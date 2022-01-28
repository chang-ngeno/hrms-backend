package changsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import changsoft.hrms.business.abstracts.FavoriteJobService;
import changsoft.hrms.business.concretes.FavoriteJobManager;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.FavoriteJob;
import changsoft.hrms.entities.dtos.favoriteJob.FavoriteJobSaveDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/favoriteJobs")
@CrossOrigin
public class FavoriteJobsController {
    private final FavoriteJobService favoriteJobService;

    @Autowired
    public FavoriteJobsController(FavoriteJobService favoriteJobService){
        this.favoriteJobService = favoriteJobService;
    }

    //Get
    @GetMapping("")
    public DataResult<List<FavoriteJob>> getAll() {
        return this.favoriteJobService.getAll();
    }

    @GetMapping("/{id}")
    public DataResult<FavoriteJob> getById(@PathVariable(value = "id") int id) {
        return this.favoriteJobService.getById(id);
    }

    @GetMapping("/getByJobAdvertisementId")
    public DataResult<List<FavoriteJob>> getByJobAdvertisementId(int id) {
        return this.favoriteJobService.getByJobAdvertisementId(id);
    }

    @GetMapping("/getByUserId")
    public DataResult<List<FavoriteJob>> getByUserId(int id) {
        return this.favoriteJobService.getByUserId(id);
    }

    @GetMapping("/getByUserEmail")
    public DataResult<List<FavoriteJob>> getByUserEmail(String email) {
        return this.favoriteJobService.getByUserEmail(email);
    }

    //Post
    @PostMapping("")
    public DataResult<FavoriteJob> save(@RequestBody FavoriteJobSaveDto dto){
        return this.favoriteJobService.save(dto);
    }

    //Delete
    @DeleteMapping("")
    public Result delete(@RequestBody FavoriteJob favoriteJob){
        return this.favoriteJobService.delete(favoriteJob);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable(value = "id") int id){
        return this.favoriteJobService.deleteById(id);
    }
}
