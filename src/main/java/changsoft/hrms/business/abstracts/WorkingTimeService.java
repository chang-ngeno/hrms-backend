package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.WorkingTime;
import changsoft.hrms.entities.dtos.workingTime.WorkingTimeSaveDto;

public interface WorkingTimeService {
    //Get
    DataResult<List<WorkingTime>> getAll();
    DataResult<WorkingTime> getById(int id);
    DataResult<WorkingTime> getByWorkingTimeName(String workingTimeName);

    //Save
    Result save(WorkingTimeSaveDto workingTime);

    //Delete
    Result delete(WorkingTime workingTime);
    Result deleteById(int id);
}
