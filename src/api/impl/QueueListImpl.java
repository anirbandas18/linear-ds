package api.impl;

import api.Queue;
import exception.SequenceUnderflowException;
import model.Node;

public class QueueListImpl extends Queue {

	@Override
	public void insert(Object item) {
		// TODO Auto-generated method stub
		Node ndptr = new Node(item);
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
