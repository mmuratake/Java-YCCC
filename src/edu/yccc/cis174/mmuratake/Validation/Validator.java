package edu.yccc.cis174.mmuratake.Validation;

public interface Validator {
	
	public void validate();
	
	public String getValidationErrorMessage();
	
	public int getSeverity();

}
