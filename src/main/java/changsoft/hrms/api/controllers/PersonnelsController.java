package changsoft.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import changsoft.hrms.business.abstracts.PersonnelService;
import changsoft.hrms.business.constants.MessageResults;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.ErrorDataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Personnel;
import changsoft.hrms.entities.dtos.personnel.PersonnelSaveDto;
import changsoft.hrms.entities.dtos.personnel.PersonnelUpdateDto;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/personnels")
@CrossOrigin
public class PersonnelsController {
    private PersonnelService personnelService;

    @Autowired
    public PersonnelsController(PersonnelService personnelService){
        this.personnelService = personnelService;
    }

    //Get
    @GetMapping("")
    public DataResult<List<Personnel>> getAll(){
        return this.personnelService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable(value = "id") int id){
        return ResponseEntity.ok(this.personnelService.getById(id));
    }

    @GetMapping("/getByEmail")
    public DataResult<Personnel> getByEmail(@PathVariable(value = "email") String email){
        return this.personnelService.getByEmail(email);
    }

    //Post
    @PostMapping("")
    public Result save(@Valid @RequestBody PersonnelSaveDto personnel){
        return this.personnelService.save(personnel);
    }

    //Put
    @PutMapping("")
    public Result updateById(@RequestBody PersonnelUpdateDto personnel){
        return this.personnelService.updateById(personnel);
    }

    //Delete
    @DeleteMapping("")
    public Result delete(@RequestBody Personnel personnel){
        return this.personnelService.delete(personnel);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable(value = "id") int id){
        return this.personnelService.deleteById(id);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions){
        Map<String, String> validationErrors = new HashMap<String, String>();
        for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()){
            validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        ErrorDataResult<Object> errors = new ErrorDataResult<Object>(validationErrors, MessageResults.error);
        return errors;
    }
}
