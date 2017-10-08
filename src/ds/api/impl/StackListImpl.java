package ds.api.impl;

import java.util.StringJoiner;

import ds.api.Stack;
import ds.exception.SequenceUnderflowException;
import ds.model.SequenceNode;

public class StackListImpl extends Stack {

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == null;
	}

	@Override
	public Integer size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		SequenceNode ndptr = new SequenceNode(item);
		size++;
		if(top == null) {
			top = ndptr;
		} else {
			ndptr.setNext(top);
			top = ndptr;
		}
	}

	@Override
	public Object pop()  throws SequenceUnderflowException{
		// TODO Auto-generated method stub
		if(top == null) {
			size = 0;
			 throw new SequenceUnderflowException(this.getClass());
		} else {
			Object item = top.getData();
			top = top.getNext();
			size--;
			return item;
		}
	}

	@Override
	public Object peek() throws SequenceUnderflowException {
		// TODO Auto-generated method stub
		if(top == null) {
			size = 0;
			throw new SequenceUnderflowException(this.getClass());
		} else {
			return top.getData();
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		top = null;
		size = 0;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		StringJoiner content = new StringJoiner(" -> ");
		for(SequenceNode ptr = top ; ptr != null ; ptr = ptr.getNext()) {
			String data = ptr.getData().toString();
			content = content.add(data);
		}
		return content.toString();
	}

}
