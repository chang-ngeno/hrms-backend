package changsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import changsoft.hrms.entities.concretes.School;

import java.util.List;

public interface SchoolDao extends JpaRepository<School, Integer> {
    List<School> getAllByResume_Id(int resumeId);
}
