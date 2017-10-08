package api.impl;

import api.Queue;
import exception.SequenceUnderflowException;
import model.Node;

public class CircularQueueListImpl extends Queue {

	@Override
	public void insert(Object item) {
		// TODO Auto-generated method stub
		Node ndptr = new Node(item);
		size++;
		if(front == null) {
			front = rear = ndptr;
		} else {
			ndptr.setNext(front);
			rear.setNext(ndptr);
			rear = ndptr;
		}
	}

	@Override
	public Object delete() throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object peek() throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

}
