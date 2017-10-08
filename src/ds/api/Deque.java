package ds.api;

import ds.exception.SequenceUnderflowException;
import ds.model.SequenceNode;

public abstract class Deque implements Sequence {
	
	protected SequenceNode front, rear;
	
	protected Integer size;
	
	public abstract void offerFirst(Object item);
	
	public abstract void offerLast(Object item);
	
	public abstract Object pollFirst() throws SequenceUnderflowException;
	
	public abstract Object pollLast() throws SequenceUnderflowException;
	
	public abstract Object peekFirst() throws SequenceUnderflowException;
	
	public abstract Object peekLast() throws SequenceUnderflowException;
	
	public Deque() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}

}
