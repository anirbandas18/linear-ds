package service;

import api.Deque;
import api.Queue;
import api.Stack;
import api.impl.DequeListImpl;
import api.impl.QueueListImpl;
import api.impl.StackListImpl;
import exception.SequenceUnderflowException;

public class SequenceService {

	public static void queueDemo() {
		Queue q = new QueueListImpl();
		try {
			System.out.println(q.delete());
		} catch (SequenceUnderflowException e) {
			System.out.println(e.getMessage());
		}
		q.insert(1);
		q.insert(2);
		q.insert("Anirban");
		q.insert(3);
		q.insert('D');
		q.insert(true);
		System.out.println(q.display());
		q.clear();
		q.insert(1);
		q.insert("jk");
		System.out.println(q.display());
		System.out.println(q.size());
	}
	
	public static void stackDemo() {
		Stack s = new StackListImpl();
		try {
			System.out.println(s.pop());
		} catch (SequenceUnderflowException e) {
			System.out.println(e.getMessage());
		}
		s.push(1);
		s.push(2);
		s.push("Anirban");
		s.push(3);
		s.push('D');
		s.push(true);
		System.out.println(s.display());
		s.clear();
		s.push(1);
		s.push("jk");
		System.out.println(s.display());
		System.out.println(s.size());
	}
	
	public static void dequeDemo() {
		Deque d = new DequeListImpl();
		try {
			System.out.println(d.pollFirst());
		} catch (SequenceUnderflowException e) {
			System.out.println(e.getMessage());
		}
		d.offerFirst(1);
		d.offerLast(2);
		d.offerFirst("Anirban");
		d.offerLast(3);
		d.offerFirst('D');
		d.offerLast(true);
		System.out.println(d.display());
		System.out.println(d.size());
		d.clear();
		d.offerLast(1);
		d.offerFirst("jk");
		System.out.println(d.display());
		System.out.println(d.size());
	}


	
}
