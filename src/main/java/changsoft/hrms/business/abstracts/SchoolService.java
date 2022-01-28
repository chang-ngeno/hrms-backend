package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.School;
import changsoft.hrms.entities.dtos.school.SchoolSaveDto;

public interface SchoolService {
    //Get
    DataResult<List<School>> getAll();
    DataResult<List<School>> getAllByResumeId(int resumeId);
    DataResult<School> getById(int id);
    DataResult<List<School>> getByIds(List<Integer> ids);

    //Post
    Result save(SchoolSaveDto school);

    //Delete
    Result delete(School school);
    Result deleteById(int id);
    Result deleteByIds(List<Integer> ids);
    Result deleteAll(List<School> schools);
}
