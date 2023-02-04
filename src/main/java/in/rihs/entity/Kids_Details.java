package in.rihs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Kids_Details {

	@Id
	@GeneratedValue
	private Long kidId;
	private String kidName;
	private Integer kidAge;
	private Long kidSSn;

}
