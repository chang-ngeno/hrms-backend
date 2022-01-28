package changsoft.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import changsoft.hrms.entities.concretes.FavoriteJob;

import java.util.List;

public interface FavoriteJobDao extends JpaRepository<FavoriteJob, Integer> {
    List<FavoriteJob> getByUser_Id(int id);
    List<FavoriteJob> getByUser_Email(String email);
    List<FavoriteJob> getByJobAdvertisement_Id(int id);
}
