package api.impl;

import java.util.StringJoiner;

import api.Deque;
import exception.SequenceUnderflowException;
import model.Node;

public class DequeListImpl implements Deque {
	
	private Node front, rear;
	
	private Integer size;

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

	@Override
	public String display() {
		// TODO Auto-generated method stub
		StringJoiner content = new StringJoiner(" -> ");
		for(Node ptr = front; ptr != null ; ptr = ptr.getNext()) {
			String data = ptr.getData().toString();
			content = content.add(data);
		}
		return content.toString();
	}

	@Override
	public void offerFirst(Object item) {
		// TODO Auto-generated method stub
		Node ndptr = new Node(item);
		size++;
		if(front == null) {
			front = rear = ndptr;
		} else {
			ndptr.setNext(front);
			front.setPrevious(ndptr);
			front = ndptr;
		}
	}

	@Override
	public void offerLast(Object item) {
		// TODO Auto-generated method stub
		Node ndptr = new Node(item);
		size++;
		if(rear == null) {
			front = rear = ndptr;
		} else {
			rear.setNext(ndptr);
			ndptr.setPrevious(rear);
			rear = ndptr;
		}
	}

	@Override
	public Object pollFirst()  throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		if(front == null) {
			rear = null;// it will still be pointing to non existent node, update it
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			Object item = front.getData();
			front = front.getNext();
			front.setPrevious(null);
			size--;
			return item;
		}
	}

	@Override
	public Object pollLast()  throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		if(rear == null) {
			front = null;// it will still be pointing to non existent node, update it
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			Object item = rear.getData();
			rear = rear.getPrevious();
			rear.setNext(null);
			size--;
			return item;
		}
	}

	@Override
	public Object peekFirst() throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		if(front == null) {
			throw new SequenceUnderflowException(this.getClass());
		} else {
			return front.getData();
		}
	}

	@Override
	public Object peekLast() throws SequenceUnderflowException{
		// TODO Auto-generated method stub
		if(rear == null) {
			throw new SequenceUnderflowException(this.getClass());
		} else {
			return rear.getData();
		}
	}

	public DequeListImpl() {
		this.front = null;
		this.rear = null;
		this.size = 0;
	}
	
}
