package in.rihs.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table
@Data
public class CreateCase {

	@Id
	@GeneratedValue
	private Long caseNumber;

	private Long appID;

	private Plan_Selection plan_Selection;

	private Education_Details education_Details;

	private Income_Details income_Details;

	private List<Kids_Details> kids_Details;

	@CreationTimestamp
	private LocalDate createdDate;

	@UpdateTimestamp
	private LocalDate updatedDate;

	private String createdBy;
	private String updatedBy;
	private String status;

}
