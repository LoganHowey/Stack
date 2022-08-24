package util;

import java.lang.reflect.Array;

public class Stack<Type> {
    public static Array data;

    public void push(Type item) {
        Type newItem = item;
        }

    public Type pop(){
        return null;
    };

    public static int size(){
       int size = 0;
        for (int i = 0; i < Array.getLength(data); i++){
            size++;}
        return size;
    }

    void grow(){

    };

    boolean requiresGrowth(){
        return false;
    };




}
