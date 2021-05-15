package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.hrms.entities.concretes.JobPosition;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class JobPositionManager implements JobPositionService{
	
	
	private JobPositionDao positionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}


	@Override
	public List<JobPosition> getAll() {
		return positionDao.findAll();
	}
	
	
}
