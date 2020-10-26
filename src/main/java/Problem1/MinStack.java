package Problem1;
import java.math.*;
import java.util.*;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    private Integer[] data;
    private Integer[] data2;
    private int size;
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    public MinStack(int size) {
        // homework
        super(size); // place holder
        data = new Integer[size];
        data2 = new Integer[size];
    }

    @Override
    public boolean push(Integer val) {
        // homework
        if(val == null){
            return false;
        }
        if(size >= data.length){
            return false;
        }
        data[size] = val;
        if(size == 0){
            data2[size] = val;
        }else{
            data2[size] = Math.min(val, data2[size - 1]);
        }
        size++;

        return true; // place holder
    }

    @Override
    public Integer pop() {
        // homework
        Integer val = data[size - 1];
        size--;
        return val; // place holder
    }

    public Integer getMin() {
        // homework
        if(size == 0){
            return null;
        }
        Integer val = data2[size - 1];
        // loop of any kind is not allowed
        return val; // place holder
    }
}

