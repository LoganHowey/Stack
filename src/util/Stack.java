package util;

import java.lang.reflect.Array;

public class Stack<Type> {
    private int size = 10;
    public Type[] data = (Type[]) new Object[size];
    private int i = 0;

    public void push(Type item) {
        if (i == size) {
            throw new ArrayIndexOutOfBoundsException("There is nothing to pop");}
        else{
        data[i] = item;
        i++;
        }
    }

    public void pop() {
        if (i == 0) {
            throw new ArrayIndexOutOfBoundsException("There is nothing to pop");
        } else {
            i--;
            data[i] = null;
        }

    }


    ;

    public int size() {
        return i;
    }

    void grow() {
        Type[] temp = (Type[]) new Object[size+1];
        for(int i = 0;  i < size; i++){
             temp[i+1] = data[i];
        }
        size++;
        data = temp;



    }

    ;

    boolean requiresGrowth() {
        if (i == size){
        return true;
    }
        else {
            return false;
        }

    }

    void testing(){
        size++;
    }
}
