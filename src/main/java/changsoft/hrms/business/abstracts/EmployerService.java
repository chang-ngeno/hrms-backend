package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Employer;
import changsoft.hrms.entities.dtos.employer.EmployerSaveDto;
import changsoft.hrms.entities.dtos.employer.EmployerUpdateDto;

public interface EmployerService {
    //Get
    DataResult<List<Employer>> getAll();
    DataResult<Employer> getById(int id);
    DataResult<Employer> getByEmail(String email);

    //Post
    Result save(EmployerSaveDto employer);

    //Put
    Result updateById(EmployerUpdateDto employer);

    //Delete
    Result delete(Employer employer);
    Result deleteById(int id);

}
