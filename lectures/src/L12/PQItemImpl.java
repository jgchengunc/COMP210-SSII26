package L12;

public class PQItemImpl<V,P extends Comparable<P>> implements PQItem<V,P> {

	private V _value;
	private P _priority;
	
	public PQItemImpl(V value, P priority) {
		_value = value;
		_priority = priority;
	}
	
	@Override
	public V getValue() {
		return _value;
	}

	@Override
	public P getPriority() {
		return _priority;
	}

}
