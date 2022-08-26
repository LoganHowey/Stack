package util;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void pushOneItem() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("Thing");
        Assert.assertThat(objectStack.size(), Is.is(1));

    }

    @Test
    public void pushAndPopOne() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("Thing");
        objectStack.pop();
        Assert.assertThat(objectStack.size(), Is.is(0));
    }

    @Test
    public void pushMultipleItems(){
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("one");
        objectStack.push("Two");
        objectStack.push("Three");
        objectStack.push("Four");
        Assert.assertThat(objectStack.size(), Is.is(4));

    }
}