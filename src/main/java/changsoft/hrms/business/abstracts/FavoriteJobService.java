package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Ability;
import changsoft.hrms.entities.concretes.FavoriteJob;
import changsoft.hrms.entities.dtos.ability.AbilitySaveDto;
import changsoft.hrms.entities.dtos.ability.AbilityUpdateDto;
import changsoft.hrms.entities.dtos.favoriteJob.FavoriteJobSaveDto;

public interface FavoriteJobService {
    //Get
    DataResult<List<FavoriteJob>> getAll();
    DataResult<FavoriteJob> getById(int id);

    DataResult<List<FavoriteJob>> getByJobAdvertisementId(int id);
    DataResult<List<FavoriteJob>> getByUserId(int id);
    DataResult<List<FavoriteJob>> getByUserEmail(String email);

    //Post
    DataResult<FavoriteJob> save(FavoriteJobSaveDto dto);

    //Delete
    Result delete(FavoriteJob favoriteJob);
    Result deleteAll(List<FavoriteJob> favoriteJobs);
    Result deleteById(int id);
}
