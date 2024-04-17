package vehicleShop.repositories;

import vehicleShop.models.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class VehicleRepository implements Repository<Vehicle>{
    private Collection<Vehicle>vehicles;


    @Override
    public Collection<Vehicle> getWorkers() {
        return new ArrayList<>(vehicles);
    }

    @Override
    public void add(Vehicle model) {
        if (!vehicles.contains(model)){
            vehicles.add(model);
        }
    }

    @Override
    public boolean remove(Vehicle model) {
        if (vehicles.contains(model)){
            vehicles.remove(model);
        }
        return false;
    }

    @Override
    public Vehicle findByName(String name) {
        return vehicles.stream()
                .filter(vehicle -> vehicle.getName().equals(name))
                .findFirst().orElse(null);
    }
}
