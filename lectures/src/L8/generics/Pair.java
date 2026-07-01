package L8.generics;

public class Pair<K, V> {
    K _key;
    V _value;

    Pair(K key, V value) {
        _key = key;
        _value = value;
    }
}
