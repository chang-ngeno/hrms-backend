package changsoft.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import changsoft.hrms.business.abstracts.CityService;
import changsoft.hrms.business.constants.MessageResults;
import changsoft.hrms.core.utilities.results.*;
import changsoft.hrms.dataAccess.abstracts.CityDao;
import changsoft.hrms.entities.concretes.City;
import changsoft.hrms.entities.dtos.city.CitySaveDto;
import changsoft.hrms.entities.dtos.city.CitySaveMultipleDto;

import java.util.List;

@Service
public class CityManager implements CityService {
    private final CityDao cityDao;
    private final String FIELD = "city";

    @Autowired
    public CityManager(CityDao cityDao){
        this.cityDao = cityDao;
    }

    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll(), MessageResults.allDataListed(FIELD));
    }

    public DataResult<City> getById(int id) {
        return new SuccessDataResult<City>(this.cityDao.findById(id).get(), MessageResults.dataListed(FIELD));
    }

    public DataResult<City> getByCityName(String cityName) {
        return new SuccessDataResult<City>(this.cityDao.getByCityName(cityName), MessageResults.dataListed(FIELD));
    }

    public Result save(CitySaveDto city) {
        if(getByCityName(city.getCityName()).getData() != null){
            return new ErrorResult(MessageResults.alreadyExists(FIELD));
        }

        City cityObject = new City(city.getCityName());
        this.cityDao.save(cityObject);
        return new SuccessResult(MessageResults.saved(FIELD));
    }

    public Result saveMultiple(CitySaveMultipleDto dto) {
        for(var city : dto.getCityNames()){
            CitySaveDto saveDto = new CitySaveDto();
            saveDto.setCityName(city);
            save(saveDto);
        }
        return new SuccessResult(MessageResults.saveds(FIELD));
    }

    public Result delete(City city) {
        this.cityDao.delete(city);
        return new SuccessResult(MessageResults.deleted(FIELD));
    }

    public Result deleteById(int id) {
        this.cityDao.deleteById(id);
        return new SuccessResult(MessageResults.deleted(FIELD));
    }
}
