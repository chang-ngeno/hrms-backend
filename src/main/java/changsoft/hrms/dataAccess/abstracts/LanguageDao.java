package changsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import changsoft.hrms.entities.concretes.Language;

import java.util.List;

public interface LanguageDao extends JpaRepository<Language, Integer> {
    List<Language> getAllByResume_Id(int resumeId);
}
