package TommasoEleodori.BEU2W1D4.dao;

import TommasoEleodori.BEU2W1D4.entities.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepo extends JpaRepository<Building, String> {
}
