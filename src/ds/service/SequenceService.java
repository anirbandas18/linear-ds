package ds.service;

import java.util.ArrayList;
import java.util.List;

import ds.api.Deque;
import ds.api.Queue;
import ds.api.Stack;
import ds.api.impl.CircularQueueListImpl;
import ds.api.impl.DequeListImpl;
import ds.api.impl.QueueListImpl;
import ds.api.impl.StackListImpl;
import ds.exception.SequenceUnderflowException;

public class SequenceService {
	
	private static List<Object> testDataSet;
	
	static {
		testDataSet = new ArrayList<>();
		testDataSet.add(1);
		testDataSet.add(2.2d);
		testDataSet.add("Anirban");
		testDataSet.add('D');
		testDataSet.add(true);
		//testDataSet.add(null);
	}

	public static void queueDemo() {
		Queue q = new QueueListImpl();
		try {
			System.out.println(q.dequeue());
		} catch (SequenceUnderflowException e) {
			System.out.println(e.getMessage());
		}
		testDataSet.forEach(d -> {
			q.enqueue(d);
		});
		System.out.println(q.display());
		q.clear();
		q.enqueue(1);
		q.enqueue("jk");
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
		testDataSet.forEach(d -> {
			s.push(d);
		});
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
		for(int index = 0 ; index < testDataSet.size() ; index++) {
			Object item = testDataSet.get(index);
			if(index % 2 == 0) {
				d.offerFirst(item);
			} else {
				d.offerLast(item);
			}
		}
		System.out.println(d.display());
		System.out.println(d.size());
		d.clear();
		d.offerLast(1);
		d.offerFirst("jk");
		System.out.println(d.display());
		System.out.println(d.size());
	}
	
	public static void circularQueueDemo() {
		Queue q = new CircularQueueListImpl();
		try {
			System.out.println(q.dequeue());
		} catch (SequenceUnderflowException e) {
			System.out.println(e.getMessage());
		}
		testDataSet.forEach(d -> {
			q.enqueue(d);
		});
		System.out.println(q.display());
		q.clear();
		q.enqueue(1);
		q.enqueue("jk");
		System.out.println(q.display());
		System.out.println(q.size());
	}

}
