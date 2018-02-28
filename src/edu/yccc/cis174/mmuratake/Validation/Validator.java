package edu.yccc.cis174.mmuratake.Validation;

public interface Validator {
	
	public void setApp(String app);
	
	public void validate();
	
	public String getValidationErrorMessage();
	
	public int getSeverity();

}
