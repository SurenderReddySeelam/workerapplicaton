package dao;

import java.util.List;

import com.suri.model.Worker;

public interface WorkerDAO {
    Worker save(Worker worker);
    Worker findById(int id);
    List<Worker> findAll();
    void deleteById(int id);
}


