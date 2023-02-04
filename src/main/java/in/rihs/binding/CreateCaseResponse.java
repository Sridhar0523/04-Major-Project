package in.rihs.binding;

import java.util.List;

import in.rihs.entity.Plan_Selection;
import lombok.Data;

@Data
public class CreateCaseResponse {

	private Long appID;
	private List<Plan_Selection> plan;
}
