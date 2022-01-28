package changsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import changsoft.hrms.business.abstracts.AbilityService;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Ability;
import changsoft.hrms.entities.dtos.ability.AbilitySaveDto;
import changsoft.hrms.entities.dtos.ability.AbilityUpdateDto;

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
