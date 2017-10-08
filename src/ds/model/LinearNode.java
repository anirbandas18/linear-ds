package ds.model;

public class LinearNode {
	
	private Object data;
	private LinearNode next, previous;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public LinearNode getNext() {
		return next;
	}
	public void setNext(LinearNode next) {
		this.next = next;
	}
	public LinearNode(Object data) {
		super();
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	public LinearNode getPrevious() {
		return previous;
	}
	public void setPrevious(LinearNode previous) {
		this.previous = previous;
	}

}
