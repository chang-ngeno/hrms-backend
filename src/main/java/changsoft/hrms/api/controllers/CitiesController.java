package changsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import changsoft.hrms.business.abstracts.CityService;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.City;
import changsoft.hrms.entities.dtos.city.CitySaveDto;
import changsoft.hrms.entities.dtos.city.CitySaveMultipleDto;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/cities")
@CrossOrigin
public class CitiesController {
    private final CityService cityService;

    @Autowired
    public CitiesController(CityService cityService){
        super();
        this.cityService = cityService;
    }

    //Get
    @GetMapping("")
    public DataResult<List<City>> getAll()  {
        return this.cityService.getAll();
    }

    @GetMapping("/{id}")
    public DataResult<City> getById(@PathVariable(value = "id") int id){
        return this.cityService.getById(id);
    }

    @GetMapping("/getByCityName")
    public DataResult<City> getByCityName(@RequestParam(value = "cityName") String cityName){
        return this.cityService.getByCityName(cityName);
    }
    //Post
    @PostMapping("")
    public Result save(@Valid @RequestBody CitySaveDto city){
        return this.cityService.save(city);
    }

    @PostMapping("/saveMultiple")
    public Result saveMultiple(@Valid @RequestBody CitySaveMultipleDto dto){
        return this.cityService.saveMultiple(dto);
    }

    //Delete
    @DeleteMapping("")
    public Result delete(@RequestBody City city){
        return this.cityService.delete(city);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable(value = "id") int id){
        return this.cityService.deleteById(id);
    }
}
