package L12;

public interface PQItem<V,P extends Comparable<P>> {
	V getValue();
	P getPriority();
}
