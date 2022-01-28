package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.City;
import changsoft.hrms.entities.dtos.city.CitySaveDto;
import changsoft.hrms.entities.dtos.city.CitySaveMultipleDto;

public interface CityService {
    //Get
    DataResult<List<City>> getAll();
    DataResult<City> getById(int id);
    DataResult<City> getByCityName(String cityName);

    //Post
    Result save(CitySaveDto city);
    Result saveMultiple(CitySaveMultipleDto city);

    //Delete
    Result delete(City city);
    Result deleteById(int id);

}
