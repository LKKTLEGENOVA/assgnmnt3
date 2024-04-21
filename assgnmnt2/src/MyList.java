
import java.util.Iterator;

public interface MyList<T> extends Iterable<T> {
    void add(T item);
    void set(int index, T item);
    T remove(int index); // Change return type to T
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst();
    T getLast();
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(Object object);
    int lastIndexOf(Object object);
    boolean exists(Object object);
    Object[] toArray();
    void clear();
    int size();
    MyList.MyIterator<T> myIterator();

    interface MyIterator<E> extends Iterator<E> {
        // Add any additional methods specific to your iterator here
    }
}