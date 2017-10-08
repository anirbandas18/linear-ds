package api;

import exception.SequenceUnderflowException;

public interface Deque extends Sequence {
	
	public void offerFirst(Object item);
	
	public void offerLast(Object item);
	
	public Object pollFirst() throws SequenceUnderflowException;
	
	public Object pollLast() throws SequenceUnderflowException;
	
	public Object peekFirst() throws SequenceUnderflowException;
	
	public Object peekLast() throws SequenceUnderflowException;

}
