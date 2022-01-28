package changsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import changsoft.hrms.business.abstracts.PositionService;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Position;
import changsoft.hrms.entities.dtos.position.PositionSaveDto;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
@CrossOrigin
public class PositionsController {
    private final PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService){
        super();
        this.positionService = positionService;
    }

    //Get
    @GetMapping("")
    public DataResult<List<Position>> getAll()  {
        return this.positionService.getAll();
    }

    @GetMapping("/{id}")
    public DataResult<Position> getById(@PathVariable(value = "id") int id){
        return this.positionService.getById(id);
    }

    @GetMapping("/getByPositionName")
    public DataResult<Position> getByPositionName(@RequestParam(value = "positionName") String positionName){
        return this.positionService.getByPositionName(positionName);
    }

    //Save
    @PostMapping("")
    public Result save(@RequestBody PositionSaveDto position){
        return this.positionService.save(position);
    }

    //Delete
    @DeleteMapping("")
    public Result delete(@RequestBody Position position){
        return this.positionService.delete(position);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable(value = "id") int id){
        return this.positionService.deleteById(id);
    }


}
