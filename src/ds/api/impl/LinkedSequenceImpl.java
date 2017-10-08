package ds.api.impl;

import java.util.StringJoiner;

import ds.api.LinkedSequence;
import ds.model.SequenceNode;

public class LinkedSequenceImpl extends LinkedSequence{

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return start == null;
	}

	@Override
	public Integer size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		size = 0;
		start = null;
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		StringJoiner sj = new StringJoiner(" -> ");
		for(SequenceNode ptr = start ; ptr != null ; ptr = ptr.getNext()) {
			String content = ptr.getData().toString();
			sj = sj.add(content);
		}
		return sj.toString();
	}

	@Override
	public void add(Object item) {
		// TODO Auto-generated method stub
		SequenceNode ndptr = new SequenceNode(item);
		if(start == null) {
			start = ndptr;
		} else {
			SequenceNode ptr = start;
			while(ptr.getNext() != null) {
				ptr = ptr.getNext();
			}
			ptr.setNext(ndptr);
			ndptr.setPrevious(ptr);
		}
		size++;
	}

	@Override
	public Boolean add(Object item, int index) {
		// TODO Auto-generated method stub
		Boolean flag = false;
		if(index >= 0 && index <= size) {
			SequenceNode ndptr = new SequenceNode(item);
			int i = 0;
			for(SequenceNode ptr = start ; ptr != null ; ptr = ptr.getNext()) {
				if(i + 1 == index) {
					ptr.getNext().setPrevious(ndptr);
					ndptr.setPrevious(ptr);
					ndptr.setNext(ptr.getNext());
					ptr.setNext(ndptr);
					break;
				}
			}
			size++;
		} 
		return flag;
	}

	@Override
	public Boolean contains(Object item) {
		// TODO Auto-generated method stub
		Integer index = getIndexOf(item);
		Boolean flag = index != -1;
		return flag;
	}

	@Override
	public Integer getIndexOf(Object item) {
		// TODO Auto-generated method stub
		Integer index = -1, i = 0;
		for(SequenceNode ptr = start ; ptr != null ; ptr = ptr.getNext()) {
			Object temp = ptr.getData();
			if(temp.equals(item)) {
				index = i;
				break;
			}
			i++;
		}
		return index;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		Object item = null;
		if(index >= 0 && index <= size) {
			int i = 0;
			for(SequenceNode ptr = start ; ptr != null ; ptr = ptr.getNext()) {
				if(i++ == index) {
					item = ptr.getData();
					break;
				}
			}
		}
		return item;
	}
	
	@Override
	public String reverse() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public Boolean delete(int index) {
		// TODO Auto-generated method stub
		Boolean flag = false;
		if(index >= 0 && index <= size) {
			int i = 0;
			for(SequenceNode ptr = start ; ptr != null ; ptr = ptr.getNext()) {
				if(i++ == index) {
					SequenceNode left = ptr.getPrevious();
					SequenceNode right = ptr.getNext();
					left.setNext(right);
					right.setPrevious(left);
					flag = true;
					size--;
					break;
				}
			}
		} 
		return flag;
	}

	@Override
	public Boolean delete(Object item) {
		// TODO Auto-generated method stub
		Integer index = getIndexOf(item);
		Boolean flag = delete(index);
		return flag;
	}

	@Override
	public Boolean update(int index, Object item) {
		// TODO Auto-generated method stub
		Boolean flag = false;
		if(index >= 0 && index <= size) {
			int i = 0;
			for(SequenceNode ptr = start ; ptr != null ; ptr = ptr.getNext()) {
				if(i++ == index) {
					ptr.setData(item);
					flag = true;
					break;
				}
			}
		} 
		return flag;
	}

}
