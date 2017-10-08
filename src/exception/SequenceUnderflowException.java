package exception;

public class SequenceUnderflowException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2400360263432108412L;

	public SequenceUnderflowException(Class<?> clazz) {
		super("No elements to delete from: " + clazz.getSimpleName());
	}

}
