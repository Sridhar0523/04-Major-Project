package in.rihs.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Plan_Selection {

	@Id
	@GeneratedValue
	private Long case_Number;
	private List plan_Name;
	
}
