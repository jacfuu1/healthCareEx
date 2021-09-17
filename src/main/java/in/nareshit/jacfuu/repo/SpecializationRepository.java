package in.nareshit.jacfuu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.nareshit.jacfuu.entity.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
	//Ajax Validation code
	@Query("SELECT COUNT(specCode)FROM Specialization WHERE specCode=:specCode")
 Integer getSpecCodeCount(String specCode);
}
