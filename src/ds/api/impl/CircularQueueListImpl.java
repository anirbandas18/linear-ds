package ds.api.impl;

import java.util.StringJoiner;

import ds.api.Queue;
import ds.exception.SequenceUnderflowException;
import ds.model.LinearNode;

public class CircularQueueListImpl extends Queue {

	@Override
	public void insert(Object item) {
		// TODO Auto-generated method stub
		LinearNode ndptr = new LinearNode(item);
		size++;
		if (rear == null) {
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
		if (front == null) {
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			Object item = front.getData();
			if (front == rear) {
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
		if (front == null) {
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			return front.getData();
		}
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		StringJoiner content = new StringJoiner(" -> ");
		LinearNode ptr = front;
		do {
			String data = ptr.getData().toString();
			content = content.add(data);
			ptr = ptr.getNext();
		} while(ptr != front);
		/*for (LinearNode ptr = front; ptr.getNext() != front; ptr = ptr.getNext()) {
			String data = ptr.getData().toString();
			content = content.add(data);
		}*/
		return content.toString();
	}

}
