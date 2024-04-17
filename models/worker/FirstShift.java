package vehicleShop.models.worker;

import vehicleShop.models.tool.Tool;

import java.util.Collection;

public class FirstShift extends BaseWorker{

    public FirstShift(String name) {
        super(name, 100);
    }

    @Override
    public void working() {
        if ((this.getStrength() - 10) < 0){
            setStrength(0);
        }else if ((this.getStrength() - 10) >= 10){
            setStrength(this.getStrength() - 10);
        }
    }
}
