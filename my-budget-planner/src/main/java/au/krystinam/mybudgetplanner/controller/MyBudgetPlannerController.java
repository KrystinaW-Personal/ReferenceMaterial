package au.krystinam.mybudgetplanner.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mbp")
public class MyBudgetPlannerController {

	private static final Logger logger = LoggerFactory.getLogger(MyBudgetPlannerController.class);
	
	@GetMapping(value="/billholders")
	public List<String> getBillHolders() {
		List<String> holders = new ArrayList<String>();
		holders.add("Krystina");
		holders.add("Rob");
		return holders;
	}
}
