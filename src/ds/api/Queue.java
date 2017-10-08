package ds.api;

import ds.exception.SequenceUnderflowException;
import ds.model.ListNode;

public abstract class Queue implements Sequence {

	protected ListNode front, rear;

	protected Integer size;
	
	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return front == null || rear == null;
	}

	@Override
	public Integer size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		front = rear = null;
		size = 0;
	}

	public abstract void insert(Object item);

	public abstract Object delete() throws SequenceUnderflowException;

	public abstract Object peek() throws SequenceUnderflowException;

}
