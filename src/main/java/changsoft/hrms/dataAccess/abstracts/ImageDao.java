package changsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import changsoft.hrms.entities.concretes.Image;

import java.util.List;

public interface ImageDao extends JpaRepository<Image, Integer> {
    List<Image> getAllByResume_Id(int resumeId);
}
