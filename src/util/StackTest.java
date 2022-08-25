package util;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void stackCreates(){
        Stack<Object> objectStack = new Stack<>();
        objectStack.push("Thing");
        Assert.assertThat(objectStack.size(), Is.is(1));

    }
}