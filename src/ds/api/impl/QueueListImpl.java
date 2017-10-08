package ds.api.impl;

import java.util.StringJoiner;

import ds.api.Queue;
import ds.exception.SequenceUnderflowException;
import ds.model.Node;

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
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		StringJoiner content = new StringJoiner(" -> ");
		for(Node ptr = front ; ptr != null ; ptr = ptr.getNext()) {
			String data = ptr.getData().toString();
			content = content.add(data);
		}
		return content.toString();
	}
	
}
