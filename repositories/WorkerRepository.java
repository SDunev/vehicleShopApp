package vehicleShop.repositories;

import vehicleShop.models.worker.Worker;

import java.util.Collection;
import java.util.Map;

public class WorkerRepository implements Repository<Worker>{
    private Map<String, Worker> workers;

    @Override
    public Collection<Worker> getWorkers() {
        return workers.values();
    }

    @Override
    public void add(Worker worker) {
        workers.putIfAbsent(worker.getName(), worker);
    }

    @Override
    public boolean remove(Worker worker) {
        return workers.remove(worker.getName()) !=null;
    }

    @Override
    public Worker findByName(String name) {
        return workers.get(name);
    }
}
