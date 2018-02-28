package edu.yccc.cis174.mmuratake.Validation;

import java.util.ArrayList;
import java.util.List;

public class ValidationController {
	
	List<Validator> validators = new ArrayList<Validator>();
	
	// Add new validators here...
	public void loadValidators()
	{
		validators.add(new HAValidator());
		validators.add(new RepoValidator());
	}
	
	public void runValidation()
	{
		for(Validator v : validators)
		{
			v.validate();
			System.out.println("Message: " + v.getValidationErrorMessage());
			System.out.println("Severity: " + v.getSeverity());
		}
	}
	
	public static void main(String[] args)
	{
		ValidationController vc = new ValidationController();
		vc.loadValidators();		
	}

}
