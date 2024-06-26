package vehicleShop.models.vehicle;

import vehicleShop.common.ExceptionMessages;

public class VehicleImpl implements Vehicle{
    private String name;
    private int strengthRequired;

    public VehicleImpl(String name, int strengthRequired) {
        setName(name);
        setStrengthRequired(strengthRequired);
    }

    public void setName(String name) {
        if ((name == null || name.equals(""))){
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setStrengthRequired(int strengthRequired) {
        if (strengthRequired < 0){
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_STRENGTH_LESS_THAN_ZERO);
        }
        this.strengthRequired = strengthRequired;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStrengthRequired() {
        return this.strengthRequired;
    }

    @Override
    public boolean reached() {
        if (this.strengthRequired == 0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void making() {
        if ((this.strengthRequired - 5) < 0){
            setStrengthRequired(0);
        }else if ((this.strengthRequired - 5) >= 5){
            setStrengthRequired(this.strengthRequired - 5);
        }
    }
}
