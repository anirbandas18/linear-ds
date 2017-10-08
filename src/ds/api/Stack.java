package ds.api;

import ds.exception.SequenceUnderflowException;
import ds.model.SequenceNode;

public abstract class Stack implements Sequence {
	
	protected SequenceNode top;
	
	protected Integer size;

	public abstract void push(Object item);
	
	public abstract Object pop()  throws SequenceUnderflowException;

	public abstract Object peek() throws SequenceUnderflowException;

	public Stack() {
		super();
		this.top = null;
		this.size = 0;
	}
	
}
