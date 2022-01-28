package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Personnel;
import changsoft.hrms.entities.dtos.personnel.PersonnelSaveDto;
import changsoft.hrms.entities.dtos.personnel.PersonnelUpdateDto;

public interface PersonnelService {
    //Get
    DataResult<List<Personnel>> getAll();
    DataResult<Personnel> getById(int id);
    DataResult<Personnel> getByEmail(String email);

    //Post
    Result save(PersonnelSaveDto personnel);

    //Put
    Result updateById(PersonnelUpdateDto personnel);

    //Delete
    Result delete(Personnel personnel);
    Result deleteById(int id);
}
