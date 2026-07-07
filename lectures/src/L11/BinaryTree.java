package L11;

public interface BinaryTree<T> {
    T getValue();
    void setValue(T value);
    BinaryTree<T> getLeft();
    void setLeft(BinaryTree<T> left);
    BinaryTree<T> getRight();
    void setRight(BinaryTree<T> right);
    int height();
    boolean contains(T value);
    boolean isEmpty();
}
