package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.suri.model.Worker;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
	public class WorkerDAOImpl implements WorkerDAO {

	    @Autowired
	    private EntityManager entityManager;

	    @Transactional
	    public Worker save(Worker worker) {
	        entityManager.persist(worker);
	        return worker;
	    }

	    public Worker findById(int id) {
	        return entityManager.find(Worker.class, id);
	    }

	    public List<Worker> findAll() {
	        return entityManager.createQuery("SELECT w FROM Worker w", Worker.class).getResultList();
	    }

	    @Transactional
	    public void deleteById(int id) {
	        Worker worker = entityManager.find(Worker.class, id);
	        if (worker != null) {
	            entityManager.remove(worker);
	        }
	    }

	}


