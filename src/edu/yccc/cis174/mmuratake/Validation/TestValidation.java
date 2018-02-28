package edu.yccc.cis174.mmuratake.Validation;

import java.util.ArrayList;
import java.util.List;

// You can rename classes!! Right click the class, then check under refactor.

public class TestValidation {
	
	List<Validator> validators = new ArrayList<Validator>();
	
	// Add new validators here...
	public void loadValidators()
	{
		validators.clear();
		validators.add(new HAValidator());
		validators.add(new RepoValidator());
	}
	
	public void runValidation()
	{
		// Just details of an application somewhere.
		String app1 = "images:tomcat replicas:1";
		String app2 = "images:repo.lm.com/tomcat replicas:1";
		
		List<String> tests = new ArrayList<String>();
		tests.add(app1);
		tests.add(app2);
		
		for(String test : tests)
		{
			loadValidators();
			for(Validator v : validators)
			{
				v.setApp(test);
				v.validate();
				System.out.println("Message: " + v.getValidationErrorMessage());
				System.out.println("Severity: " + v.getSeverity());
			}
		}
	}
	
	public static void main(String[] args)
	{
		TestValidation vc = new TestValidation();
		vc.loadValidators();
		vc.runValidation();
	}

}
