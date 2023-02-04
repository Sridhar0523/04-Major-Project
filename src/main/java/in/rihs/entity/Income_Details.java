package in.rihs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Income_Details {
	
	@Id
	@GeneratedValue
	private Float monthly_Salary_Income;
	private Float rent_Income;
	private Float property_Income;

}
