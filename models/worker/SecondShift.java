package vehicleShop.models.worker;

public class SecondShift extends BaseWorker{
    public SecondShift(String name) {
        super(name, 70);
    }

    @Override
    public void working() {
        if ((this.getStrength() - 15) < 15){
            setStrength(0);
        }else if ((this.getStrength() - 15) >= 15){
            setStrength(this.getStrength() - 10);
        }
    }
}
