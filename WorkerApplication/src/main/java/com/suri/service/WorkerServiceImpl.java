package com.suri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suri.model.Worker;

import dao.WorkerDAO;

@Service
	public class WorkerServiceImpl implements WorkerService {

	    @Autowired
	    private WorkerDAO workerDAO;

	    public Worker save(Worker worker) {
	        return workerDAO.save(worker);
	    }

	    public Worker findById(int id) {
	        return workerDAO.findById(id);
	    }

	    public List<Worker> findAll() {
	        return workerDAO.findAll();
	    }

	    public void deleteById(int id) {
	        workerDAO.deleteById(id);
	    }

	}



