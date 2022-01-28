package changsoft.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import changsoft.hrms.business.abstracts.FavoriteJobService;
import changsoft.hrms.business.abstracts.JobAdvertisementService;
import changsoft.hrms.business.abstracts.UserService;
import changsoft.hrms.business.constants.MessageResults;
import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.core.utilities.results.SuccessDataResult;
import changsoft.hrms.core.utilities.results.SuccessResult;
import changsoft.hrms.dataAccess.abstracts.FavoriteJobDao;
import changsoft.hrms.entities.concretes.FavoriteJob;
import changsoft.hrms.entities.concretes.JobAdvertisement;
import changsoft.hrms.entities.concretes.User;
import changsoft.hrms.entities.dtos.favoriteJob.FavoriteJobSaveDto;

import java.util.List;

@Service
public class FavoriteJobManager implements FavoriteJobService {
    private final FavoriteJobDao favoriteJobDao;
    private final UserService userService;
    private final JobAdvertisementService jobAdvertisementService;

    private final String FIELD = "favoriteJob";

    @Autowired
    public FavoriteJobManager(FavoriteJobDao favoriteJobDao, UserService userService, JobAdvertisementService jobAdvertisementService){
        this.favoriteJobDao = favoriteJobDao;
        this.userService = userService;
        this.jobAdvertisementService = jobAdvertisementService;
    }

    public DataResult<List<FavoriteJob>> getAll() {
        return new SuccessDataResult<List<FavoriteJob>>(this.favoriteJobDao.findAll(), MessageResults.allDataListed(FIELD));
    }

    public DataResult<FavoriteJob> getById(int id) {
        return new SuccessDataResult<FavoriteJob>(this.favoriteJobDao.findById(id).get(), MessageResults.dataListed(FIELD));
    }

    public DataResult<List<FavoriteJob>> getByJobAdvertisementId(int id) {
        return new SuccessDataResult<List<FavoriteJob>>(this.favoriteJobDao.getByJobAdvertisement_Id(id), MessageResults.allDataListed(FIELD));
    }

    public DataResult<List<FavoriteJob>> getByUserId(int id) {
        return new SuccessDataResult<List<FavoriteJob>>(this.favoriteJobDao.getByUser_Id(id), MessageResults.allDataListed(FIELD));
    }

    public DataResult<List<FavoriteJob>> getByUserEmail(String email) {
        return new SuccessDataResult<List<FavoriteJob>>(this.favoriteJobDao.getByUser_Email(email), MessageResults.allDataListed(FIELD));
    }

    public DataResult<FavoriteJob> save(FavoriteJobSaveDto dto) {
        User user = userService.getById(dto.getUserId()).getData();
        JobAdvertisement jobAdvertisement = jobAdvertisementService.getById(dto.getJobAdvertisementId()).getData();
        FavoriteJob favoriteJob = new FavoriteJob(user, jobAdvertisement);
        return new SuccessDataResult(this.favoriteJobDao.save(favoriteJob), MessageResults.jobAddedFavorite);
    }

    public Result delete(FavoriteJob favoriteJob) {
        this.favoriteJobDao.delete(favoriteJob);
        return new SuccessResult(MessageResults.jobRemovedFavorite);
    }

    public Result deleteAll(List<FavoriteJob> favoriteJobs) {
        for(FavoriteJob favoriteJob : favoriteJobs){
            delete(favoriteJob);
        }
        return new SuccessResult(MessageResults.deleteds(FIELD));
    }

    public Result deleteById(int id) {
        this.favoriteJobDao.deleteById(id);
        return new SuccessResult(MessageResults.jobRemovedFavorite);
    }
}
