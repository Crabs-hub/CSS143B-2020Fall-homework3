package Problem1;

import org.w3c.dom.Node;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        // homework
        if(val == null){
            return false;
        }
        data.addFirst(val);

        return true;   // place holder
    }

    @Override
    public T pop() {
        // homework
        T val = null;
        if(data.size() == 0){

        }else {
            val = data.removeFirst();
        }
        return val;   // place holder
    }

    @Override
    public T peek() {
        // homework
        T val = data.peekFirst();  // place holder
        return val;   // place holder
    }

    @Override
    public int size() {
        if(data == null){
            return 0;
        }
        return data.size();
    }
}
