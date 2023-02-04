package in.rihs.service;

import org.springframework.stereotype.Service;

import in.rihs.binding.CreateCaseResponse;
import in.rihs.binding.Education_Details_Request;
import in.rihs.binding.Income_Details_Request;
import in.rihs.binding.Kids_Details_Request;
import in.rihs.binding.Plan_Selection_Request;

@Service
public interface CaseService {

	public CreateCaseResponse createCase(Long appID);

	public Long addPlan(Plan_Selection_Request plan_Selection_Request);

	public Long addEducationDetails(Education_Details_Request education_Details_Request);

	public Long addIncomeDetails(Income_Details_Request income_Details_Request);

	public String addKidsDetails(Kids_Details_Request kids_Details_Request);

}
