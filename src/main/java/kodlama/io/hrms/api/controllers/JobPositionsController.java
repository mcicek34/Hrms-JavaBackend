package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.entities.concretes.JobPosition;

@RestController // Sen bir rest controllersın
@RequestMapping("/api/jobpositions") //

public class JobPositionsController {

	private JobPositionService positionService;
	
	@Autowired // injection yapıyoruz
	public JobPositionsController(JobPositionService positionService) {
		super();
		this.positionService = positionService;
	}


	@GetMapping("/getall") // veri istediğim için kullanıyorum
	public List<JobPosition> getAll() {
		return positionService.getAll();
	}
}
