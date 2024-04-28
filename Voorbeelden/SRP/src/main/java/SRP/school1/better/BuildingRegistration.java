package SRP.school1.better;

import java.util.ArrayList;
import java.util.List;

/** Keeps a registry of Buildings and allows to manipulate the registry */
public class BuildingRegistration {

    private final List<Building> locations = new ArrayList<>();

    public void addBuilding(Building building) {
        locations.add(building);
    }

    public void removeBuilding(Building building) {
        locations.remove(building);
    }

    public Building getBuildingByName(String name) {//TODO implement
        return null;
    }

    public Building getBuildingByAddress(String address) {//TODO implement
        return null;
    }
    //and many more building related methods

}
