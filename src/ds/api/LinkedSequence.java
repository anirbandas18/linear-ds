package ds.api;

import ds.model.SequenceNode;

public abstract class LinkedSequence implements Sequence {

	protected SequenceNode start;
	
	protected Integer size;
	
	public abstract void add(Object item);
	
	public abstract Boolean add(Object item, int index);
	
	public abstract Boolean delete(int index);
	
	public abstract Boolean delete(Object item);
	
	public abstract Boolean contains(Object item);
	
	public abstract Integer getIndexOf(Object item);
	
	public abstract Object get(int index);
	
	public abstract Boolean update(int index, Object item);
	
	public abstract void reverse();

	public LinkedSequence() {
		this.start = null;
	}

}
