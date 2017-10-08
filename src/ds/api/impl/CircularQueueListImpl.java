package ds.api.impl;

import ds.api.Queue;
import ds.exception.SequenceUnderflowException;
import ds.model.Node;

public class CircularQueueListImpl extends Queue {

	@Override
	public void insert(Object item) {
		// TODO Auto-generated method stub
		Node ndptr = new Node(item);
		size++;
		if(rear == null) {
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
		if(front == null) {
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			Object item = front.getData();
			if(front == rear) {
				clear();
			} else {
				front = front.getNext();
				rear.setNext(front);
			}
			size--;
			return item;
		}
	}

	@Override
	public Object peek() throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

}
