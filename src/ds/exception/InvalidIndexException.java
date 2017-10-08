package ds.exception;

public class InvalidIndexException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6878606141491754820L;

	public InvalidIndexException(Integer index) {
		super("Invalid index position specified: " + index);
	}

}
