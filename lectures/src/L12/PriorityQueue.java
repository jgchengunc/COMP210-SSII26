package L12;

public interface PriorityQueue<V,P extends Comparable<P>> {
	void enqueue(V value, P priority);
	V dequeue();
	V getMin();
	int size();
}
