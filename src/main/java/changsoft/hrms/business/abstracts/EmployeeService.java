package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Employee;
import changsoft.hrms.entities.dtos.employee.EmployeeSaveDto;
import changsoft.hrms.entities.dtos.employee.EmployeeUpdateDto;

public interface EmployeeService {
    //Get
    DataResult<List<Employee>> getAll();
    DataResult<Employee> getById(int id);
    DataResult<Employee> getByEmail(String email);
    DataResult<Employee> getByIdentityNo(String tcNo);

    //Post
    Result save(EmployeeSaveDto employee);

    //Put
    Result updateById(EmployeeUpdateDto employee);

    //Delete
    Result delete(Employee employee);
    Result deleteById(int id);
}
