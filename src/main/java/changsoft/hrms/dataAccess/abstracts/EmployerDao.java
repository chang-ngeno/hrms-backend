package changsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import changsoft.hrms.core.utilities.results.DataResult;
import changsoft.hrms.entities.concretes.Employer;
import changsoft.hrms.entities.concretes.Position;
import changsoft.hrms.entities.dtos.employer.EmployerUpdateDto;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
    Employer getByUser_Email(String email);

    @Transactional
    @Modifying
    @Query("update Employer e set e.companyName=(:#{#dto.companyName}), e.website=(:#{#dto.website}), e.phone=(:#{#dto.phone}) where e.userId=(:#{#dto.userId})")
    void updateById(EmployerUpdateDto dto);
}
