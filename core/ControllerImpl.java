package vehicleShop.core;

import vehicleShop.common.ConstantMessages;
import vehicleShop.common.ExceptionMessages;
import vehicleShop.models.tool.Tool;
import vehicleShop.models.tool.ToolImpl;
import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.vehicle.VehicleImpl;
import vehicleShop.models.worker.Worker;
import vehicleShop.repositories.VehicleRepository;
import vehicleShop.repositories.WorkerRepository;

public class ControllerImpl implements Controller{

    @Override
    public String addWorker(String type, String workerName) {
        StringBuilder stringBuilder = new StringBuilder();
        switch (type){
            case "FirstShift":
                stringBuilder.append(String.format(ConstantMessages.ADDED_WORKER,type, workerName));
                break;
            case "SecondShift":
                stringBuilder.append(String.format(ConstantMessages.ADDED_WORKER,type,workerName));
                break;
            default:
                throw new IllegalArgumentException(ExceptionMessages.WORKER_TYPE_DOESNT_EXIST);
        }
        return stringBuilder.toString();
    }

    @Override
    public String addVehicle(String vehicleName, int strengthRequired) {
        Vehicle vehicle = new VehicleImpl(vehicleName, strengthRequired);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_VEHICLE, vehicleName);
    }

    @Override
    public String addToolToWorker(String workerName, int power) {
        Tool tool = new ToolImpl(power);
        WorkerRepository workerRepository = new WorkerRepository();
        Worker worker = workerRepository.findByName(workerName);


        return null;
    }

    @Override
    public String makingVehicle(String vehicleName) {
        return null;
    }

    @Override
    public String statistics() {
        return null;
    }
}
