package changsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.core.utilities.results.Result;
import changsoft.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer> {
    Position getByPositionName(String positionName);
}
