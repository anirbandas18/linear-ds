package ds.api.impl;

import ds.api.Queue;
import ds.exception.SequenceUnderflowException;
import ds.model.ListNode;

public class QueueListImpl extends Queue {

	@Override
	public void insert(Object item) {
		// TODO Auto-generated method stub
		ListNode ndptr = new ListNode(item);
		size++;
		if(rear == null) {
			front = rear = ndptr;
		} else {
			rear.setNext(ndptr);
			rear = ndptr;
		}
	}

	@Override
	public Object delete()  throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		if(front == null) {
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			Object item = front.getData();
			front = front.getNext();
			size--;
			return item;
		}
	}

	@Override
	public Object peek() throws SequenceUnderflowException{
		// TODO Auto-generated method stub
		if(front == null) {
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			return front.getData();
		}
	}
	
	public QueueListImpl() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
}
