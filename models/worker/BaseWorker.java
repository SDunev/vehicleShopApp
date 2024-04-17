package vehicleShop.models.worker;

import vehicleShop.common.ExceptionMessages;
import vehicleShop.models.tool.Tool;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseWorker implements Worker {
    private String name;
    private int strength;
    private Collection<Tool> tools;

    public BaseWorker(String name, int strength) {
        setName(name);
        setStrength(strength);
        this.tools = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.equals("")){
            throw new IllegalArgumentException(ExceptionMessages.WORKER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setStrength(int strength) {
        if (strength < 0){
            throw new IllegalArgumentException(ExceptionMessages.WORKER_STRENGTH_LESS_THAN_ZERO);
        }
        this.strength = strength;
    }

    @Override
    public abstract void working();

    @Override
    public void addTool(Tool tool) {
        this.tools.add(tool);
    }

    @Override
    public boolean canWork() {
        if (this.strength > 0){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    @Override
    public Collection<Tool> getTools() {
        return this.tools;
    }
}
