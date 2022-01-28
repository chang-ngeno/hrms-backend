package changsoft.hrms.business.abstracts;

import java.util.List;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Position;
import changsoft.hrms.entities.dtos.position.PositionSaveDto;

public interface PositionService {
    //Get
    DataResult<List<Position>> getAll();
    DataResult<Position> getById(int id);
    DataResult<Position> getByPositionName(String positionName);

    //Save
    Result save(PositionSaveDto position);

    //Delete
    Result delete(Position position);
    Result deleteById(int id);
}
