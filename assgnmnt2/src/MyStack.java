public class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        this.list = new MyArrayList<>();
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        // Remove the item and return it
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (isEmpty())
            throw new IllegalStateException("Stack is empty");
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}

