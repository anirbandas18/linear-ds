package api;

import java.util.StringJoiner;

import exception.SequenceUnderflowException;
import model.Node;

public abstract class Queue implements Sequence {

	protected Node front, rear;

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

	public abstract void insert(Object item);

	public abstract Object delete() throws SequenceUnderflowException;

	public abstract Object peek() throws SequenceUnderflowException;

}
