package ds.api;

import ds.exception.SequenceUnderflowException;

public interface Stack extends Sequence {

	public void push(Object item);
	
	public Object pop()  throws SequenceUnderflowException;

	public Object peek() throws SequenceUnderflowException;
	
}
