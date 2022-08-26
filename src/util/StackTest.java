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
    public void pushMultipleItems() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("one");
        objectStack.push("Two");
        objectStack.push("Three");
        objectStack.push("Four");
        Assert.assertThat(objectStack.size(), Is.is(4));

    }

    @Test
            (expected = ArrayIndexOutOfBoundsException.class)
    public void popEmptyStack() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.pop();
        objectStack.pop();
        System.out.println("hi");
    }

    @Test
    public void createFullStack() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("one");
        objectStack.push("Two");
        objectStack.push("Three");
        objectStack.push("Four");
        objectStack.push("Five");
        objectStack.push("Six");
        objectStack.push("Seven");
        objectStack.push("Eight");
        objectStack.push("Nine");
        objectStack.push("Ten");
        Assert.assertThat(objectStack.size(), Is.is(10));

    }

    @Test
            (expected = ArrayIndexOutOfBoundsException.class)
    public void pushOnFullStack() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("one");
        objectStack.push("Two");
        objectStack.push("Three");
        objectStack.push("Four");
        objectStack.push("Five");
        objectStack.push("Six");
        objectStack.push("Seven");
        objectStack.push("Eight");
        objectStack.push("Nine");
        objectStack.push("Ten");
        objectStack.push("Eleven");
    }

    @Test
    public void checkSizeGrowth() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("one");
        objectStack.push("Two");
        objectStack.push("Three");
        objectStack.push("Four");
        objectStack.push("Five");
        objectStack.push("Six");
        objectStack.push("Seven");
        objectStack.push("Eight");
        objectStack.push("Nine");
        objectStack.push("Ten");
        objectStack.grow();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            objectStack.push("Eleven");
        objectStack.grow();
        objectStack.push("Twelve");
        Assert.assertThat(objectStack.size(), Is.is(12));


    }

    @Test
    public void stackRequiresGrowth() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("one");
        objectStack.push("Two");
        objectStack.push("Three");
        objectStack.push("Four");
        objectStack.push("Five");
        objectStack.push("Six");
        objectStack.push("Seven");
        objectStack.push("Eight");
        objectStack.push("Nine");
        objectStack.push("Ten");
        objectStack.requiresGrowth();
        Assert.assertThat(objectStack.requiresGrowth(), Is.is(true));
    }

    @Test
    public void stackDoesNotRequiresGrowth() {
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("one");
        objectStack.push("Two");
        objectStack.push("Three");
        objectStack.push("Four");
        objectStack.push("Five");
        objectStack.push("Six");
        objectStack.push("Seven");
        objectStack.push("Eight");
        objectStack.push("Nine");
        objectStack.requiresGrowth();
        Assert.assertThat(objectStack.requiresGrowth(), Is.is(false));
    }
}