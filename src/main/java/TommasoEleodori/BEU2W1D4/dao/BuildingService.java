package TommasoEleodori.BEU2W1D4.dao;

import TommasoEleodori.BEU2W1D4.entities.Building;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BuildingService implements IBuildingDAO {
    @Autowired
    private BuildingRepo buildingRepo;

    @Override
    public void save(Building building) {

    }

    @Override
    public Building findByID(String name) {
        return null;
    }

    @Override
    public void findByIdAndUpdate(String name) {

    }

    @Override
    public void findByIdAndDelete(String name) {

    }

    @Override
    public List<Building> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }
}
