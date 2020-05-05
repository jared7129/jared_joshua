package za.co.discovery.assignment.exception;




/**
 * 
 * @author Jared Joshua
 * Exception Thrown for Duplicate Values
 */

public class NoDuplicateValuesException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Source and Destination must have different values.";
	}
}