package changsoft.hrms.business.abstracts;


import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.JobExperience;
import changsoft.hrms.entities.dtos.jobExperience.JobExperienceSaveDto;

public interface JobExperienceService {
    //Get
    DataResult<List<JobExperience>> getAll();
    DataResult<List<JobExperience>> getAllByResumeId(int resumeId);
    DataResult<JobExperience> getById(int id);
    DataResult<List<JobExperience>> getByIds(List<Integer> ids);

    //Post
    Result save(JobExperienceSaveDto jobExperience);

    //Delete
    Result delete(JobExperience jobExperience);
    Result deleteById(int id);
    Result deleteByIds(List<Integer> ids);
    Result deleteAll(List<JobExperience> jobExperiences);
}
