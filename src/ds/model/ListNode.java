package ds.model;

public class ListNode {
	
	private Object data;
	private ListNode next, previous;
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	public ListNode(Object data) {
		super();
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	public ListNode getPrevious() {
		return previous;
	}
	public void setPrevious(ListNode previous) {
		this.previous = previous;
	}

}
