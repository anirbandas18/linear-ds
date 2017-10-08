package ds.model;

public class Node {
	
	private Object data;
	private Node next, previous;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(Object data) {
		super();
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	public Node getPrevious() {
		return previous;
	}
	public void setPrevious(Node previous) {
		this.previous = previous;
	}

}
