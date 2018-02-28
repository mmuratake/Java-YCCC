package edu.yccc.cis174.mmuratake.Validation;

/**
 * @author sMamiMuratake
 * 
 * This validator assures that all docker images come from a repository in our domain.
 *
 */

public class RepoValidator implements Validator{

	String app;
	String errorMessage;
	int severity;
	
	public void validate() 
	{
		String image = app.substring(app.indexOf(":") +1, app.indexOf(" "));
		System.out.println(image);
		// Trying to get it to print tomcat. I don't get it, but I'm getting everything else, so that's fine with me.
		
		// They got that tomcat image from somewhere else. If it doesn't start with this...
		if(!image.startsWith("repo.lm.com"))
		{
			errorMessage = "The image is not stored in an LM repo.";
			severity = 2;
		}
		else
		{
			errorMessage = "Looks good.";
		}
	}

	public String getValidationErrorMessage() 
	{
		return errorMessage;
	}

	public int getSeverity() 
	{
		return severity;
	}

	public void setApp(String app) 
	{
		this.app = app;
	}

}
