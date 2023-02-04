package in.rihs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Education_Details {

	@Id
	@GeneratedValue
	private String highestDegree;
	private Long graduationYear;
	private String universityName;

}
