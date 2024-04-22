package com.suri.service;

import java.util.List;

import com.suri.model.Worker;

public interface WorkerService {
	
	    Worker save(Worker worker);
	    Worker findById(int id);
	    List<Worker> findAll();
	    void deleteById(int id);
	


}
