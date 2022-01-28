package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Resume;
import changsoft.hrms.entities.dtos.resume.ResumeSaveDto;
import changsoft.hrms.entities.dtos.resume.ResumeUpdateDto;

public interface ResumeService {
    //Get
    DataResult<List<Resume>> getAll();
    DataResult<Resume> getById(int id);
    DataResult<Resume> getByEmployeeId(int employeeId);

    //Post
    Result save(ResumeSaveDto resume);

    //Put
    Result updateById(ResumeUpdateDto resume);

    //Delete
    Result delete(Resume resume);
    Result deleteById(int id);
}
