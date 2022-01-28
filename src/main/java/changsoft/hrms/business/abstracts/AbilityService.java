package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Ability;
import changsoft.hrms.entities.dtos.ability.AbilitySaveDto;
import changsoft.hrms.entities.dtos.ability.AbilityUpdateDto;

public interface AbilityService {
    //Get
    DataResult<List<Ability>> getAll();
    DataResult<List<Ability>> getAllByResumeId(int resumeId);
    DataResult<Ability> getById(int id);
    DataResult<List<Ability>> getByIds(List<Integer> ids);

    //Post
    Result save(AbilitySaveDto ability);

    //Put
    Result updateById(AbilityUpdateDto ability);

    //Delete
    Result delete(Ability ability);
    Result deleteById(int id);
    Result deleteByIds(List<Integer> ids);
    Result deleteAll(List<Ability> abilities);
}
