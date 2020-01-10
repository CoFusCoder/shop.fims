package shop.fims.budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExecutionService {

	@Autowired
	private ExecutionMapper executionMapper;
}
