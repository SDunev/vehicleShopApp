package vehicleShop.models.tool;

import vehicleShop.common.ExceptionMessages;

public class ToolImpl implements Tool{
   private int power;

    public ToolImpl(int power) {
        setPower(power);
    }

    public void setPower(int power) {
        if (power < 0){
            throw new IllegalArgumentException(ExceptionMessages.TOOL_POWER_LESS_THAN_ZERO);
        }
        this.power = power;
    }

    @Override
    public int getPower() {
        return this.power;
    }

    @Override
    public void decreasesPower() {
        if ((this.power - 5) < 0){
            setPower(0);
        }else if ((this.power - 5) >= 5){
            setPower(this.power - 5);
        }
    }

    @Override
    public boolean isUnfit() {
        if (this.power == 0){
            return true;
        }else {
            return false;
        }
    }
}
