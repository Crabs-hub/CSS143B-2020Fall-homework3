package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        data = (T[])(new Object[capacity]);
        size = 0;
    }

    @Override
    public boolean push(T val) {
        // homework
        if (val == null){
            return false;
        }
        if(size >= data.length){
            return false;
        }
        data[size++] = val;

        return true;
    }

    @Override
    public T pop() {
        // homework
        T val = data[size - 1];
        size--;
        return val;
    }

    @Override
    public T peek() {
        // homework
        T val = data[size - 1];
        return val;
    }

    @Override
    public int size() {
        return size;
    }
}
