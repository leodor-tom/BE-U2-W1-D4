package TommasoEleodori.BEU2W1D4.dao;

import TommasoEleodori.BEU2W1D4.entities.Building;

import java.util.List;

public interface IBuildingDAO {
    public void save(Building building);

    public Building findByID(String name);

    public void findByIdAndUpdate(String name);

    public void findByIdAndDelete(String name);

    public List<Building> findAll();

    public long count();


}
