package in.rihs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rihs.binding.CreateCaseResponse;
import in.rihs.binding.Education_Details_Request;
import in.rihs.binding.Income_Details_Request;
import in.rihs.binding.Kids_Details_Request;
import in.rihs.binding.Plan_Selection_Request;
import in.rihs.repository.CreateCaseRepository;
import in.rihs.repository.Education_Details_Repository;
import in.rihs.repository.Income_Details_Repository;
import in.rihs.repository.Kids_Details_Repository;
import in.rihs.repository.Plan_Selection_Repository;

@Service
public class CaseServiceImpl implements CaseService {

	@Autowired
	private CreateCaseRepository createCaseRepository;

	@Autowired
	private Education_Details_Repository education_Details_Repository;

	@Autowired
	private Income_Details_Repository income_Details_Repository;

	@Autowired
	private Kids_Details_Repository kids_Details_Repository;

	@Autowired
	private Plan_Selection_Repository plan_Selection_Repository;

	@Override
	public CreateCaseResponse createCase(Long appID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addPlan(Plan_Selection_Request plan_Selection_Request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addEducationDetails(Education_Details_Request education_Details_Request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long addIncomeDetails(Income_Details_Request income_Details_Request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addKidsDetails(Kids_Details_Request kids_Details_Request) {
		// TODO Auto-generated method stub
		return null;
	}

}
