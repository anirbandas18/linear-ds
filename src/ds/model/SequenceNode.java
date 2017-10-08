package ds.model;

public class SequenceNode {
	
	private Object data;
	private SequenceNode next, previous;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public SequenceNode getNext() {
		return next;
	}
	public void setNext(SequenceNode next) {
		this.next = next;
	}
	public SequenceNode(Object data) {
		super();
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	public SequenceNode getPrevious() {
		return previous;
	}
	public void setPrevious(SequenceNode previous) {
		this.previous = previous;
	}

}
