package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suri.model.Worker;
import com.suri.service.WorkerService;

@RestController
	@RequestMapping("/workers")
	public class WorkerController {

	    @Autowired
	    private WorkerService workerService;

	    @PostMapping
	    public ResponseEntity<Worker> addWorker(@RequestBody Worker worker) {
	        Worker savedWorker = workerService.save(worker);
	        return new ResponseEntity<>(savedWorker, HttpStatus.CREATED);
	    }

	    @GetMapping("/{id}")
	    public ResponseEntity<Worker> getWorker(@PathVariable int id) {
	        Worker worker = workerService.findById(id);
	        if (worker != null) {
	            return new ResponseEntity<>(worker, HttpStatus.OK);
	        }
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }

	    @GetMapping
	    public ResponseEntity<List<Worker>> getAllWorkers() {
	        List<Worker> workers = workerService.findAll();
	        return new ResponseEntity<>(workers, HttpStatus.OK);
	    }

	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteWorker(@PathVariable int id) {
	        workerService.deleteById(id);
	        return ResponseEntity.noContent().build();
	    }
	}


