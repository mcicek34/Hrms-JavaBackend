package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_positions")//veri tabanında hangi tabloya karsilik geliyor

@NoArgsConstructor
@AllArgsConstructor


public class JobPosition {
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;

}
