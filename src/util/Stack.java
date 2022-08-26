package util;

import java.lang.reflect.Array;

public class Stack<Type> {
    public Type[] data = (Type[]) new Object[10];
    private int i = 0;

    public void push(Type item) {
        data[i] = item;
        i++;
    }

    public void pop() {
        if (i == 0){
            throw new ArrayIndexOutOfBoundsException("There is nothing to pop");
        }
        else {
            i--;
            data[i] = null;
        }

    }


    ;

    public int size() {
        return i;
    }

    void grow() {

    }

    ;

    boolean requiresGrowth() {
        return false;
    }

    ;


}
