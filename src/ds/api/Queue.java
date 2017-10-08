package ds.api;

import ds.exception.SequenceUnderflowException;
import ds.model.SequenceNode;

public abstract class Queue implements Sequence {

	protected SequenceNode front, rear;

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
	
	/*@Override
	public String display() {
		// TODO Auto-generated method stub
		StringJoiner content = new StringJoiner(" -> ");
		for(ListNode ptr = front; ptr != null ; ptr = ptr.getNext()) {
			String data = ptr.getData().toString();
			content = content.add(data);
		}
		return content.toString();
	}*/

	public abstract void enqueue(Object item);

	public abstract Object dequeue() throws SequenceUnderflowException;

	public abstract Object peek() throws SequenceUnderflowException;

	public Queue() {
		super();
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
	

}
