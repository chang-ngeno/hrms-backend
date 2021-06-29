package latifyilmaz.hrms.api.controllers;

import latifyilmaz.hrms.business.abstracts.AbilityService;
import latifyilmaz.hrms.core.utilities.results.DataResult;
import latifyilmaz.hrms.core.utilities.results.Result;
import latifyilmaz.hrms.entities.concretes.Ability;
import latifyilmaz.hrms.entities.dtos.ability.AbilitySaveDto;
import latifyilmaz.hrms.entities.dtos.ability.AbilityUpdateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/abilities")
@CrossOrigin
public class AbilitiesController {
    private final AbilityService abilityService;

    @Autowired
    public AbilitiesController(AbilityService abilityService){
        this.abilityService = abilityService;
    }

    //Get
    @GetMapping("")
    public DataResult<List<Ability>> getAll() {
        return this.abilityService.getAll();
    }

    @GetMapping("/getAllByResumeId")
    public DataResult<List<Ability>> getAllByResumeId(int resumeId) {
        return this.abilityService.getAllByResumeId(resumeId);
    }

    @GetMapping("/{id}")
    public DataResult<Ability> getById(@PathVariable(value = "id") int id) {
        return this.abilityService.getById(id);
    }


    //Post
    @PostMapping("")
    public Result save(@Valid @RequestBody AbilitySaveDto ability){
        return this.abilityService.save(ability);
    }

    //Put
    @PutMapping("")
    public Result updateById(@RequestBody AbilityUpdateDto ability) {
        return this.abilityService.updateById(ability);
    }

    //Delete
    @DeleteMapping("")
    public Result delete(@RequestBody Ability ability){
        return this.abilityService.delete(ability);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable(value = "id") int id){
        return this.abilityService.deleteById(id);
    }
}
