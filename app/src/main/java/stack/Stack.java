package stack;

public class Stack<T> implements Stackable<T> {

	private transient Node head;

	private transient int stackSize;

	private class Node {
		transient T obj;
		transient Node next;
	}

	@Override
	public void push(T obj) {
		Node node = new Node();
		node.obj = obj;
		node.next = head;
		head = node;
		stackSize++;
	}

	@Override
	public T pop() {
		T retObj = head.obj;
		head = head.next;
		stackSize--;
		return retObj;
	}

	@Override
	public boolean isEmpty() {
		return head == null;
	}

	@Override
	public T peek() {
		return head.obj;
	}

	@SuppressWarnings("PMD.NullAssignment")
	@Override
	public void clear() {
		head = null;
		stackSize = 0;
	}

	@Override
	public void print() {
		Node node = head;
		while (node != null) {
			System.out.println(node.obj);
			node = node.next;
		}
	}

	@Override
	public int size() {
		return stackSize;
	}

}
