package vehicleShop.models.shop;

import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.worker.Worker;

public class ShopImpl implements Shop{


    @Override
    public void make(Vehicle vehicle, Worker worker) {
        if (worker.canWork() && worker.getTools().size() > 0){
            vehicle.reached();
        }
    }
}
