package ds.api;

import ds.exception.SequenceUnderflowException;
import ds.model.LinearNode;

public abstract class Stack implements Sequence {
	
	protected LinearNode top;
	
	protected Integer size;

	public abstract void push(Object item);
	
	public abstract Object pop()  throws SequenceUnderflowException;

	public abstract Object peek() throws SequenceUnderflowException;
	
}
