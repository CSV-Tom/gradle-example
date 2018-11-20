package stack;

public interface Stackable<T> {

	public void push(T obj);

	public T pop();

	public boolean isEmpty();

	public T peek();

	public void clear();

	public void print();

	public int size();
}
