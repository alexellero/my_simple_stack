package deqo.aell_mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void isEmpty() {
        SimpleStack stack = new Stack();
        assertTrue(stack.isEmpty());
        Item item = new Item(1);
        stack.push(item);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void getSize() {
        SimpleStack stack = new Stack();
        assertEquals(0,stack.getSize());
        Item item = new Item(1);
        stack.push(item);
        assertEquals(1,stack.getSize());
    }

    @Test
    public void push() {
        SimpleStack stack = new Stack();
        Item item = new Item(1);
        stack.push(item);
        assertFalse(stack.isEmpty());
        assertEquals(1,stack.getSize());
        assertSame(item,stack.peek());
    }

    @Test
    public void peek() {
        SimpleStack stack = new Stack();
        Item item = new Item(1);
        stack.push(item);
        assertSame(item,stack.peek());
    }

    @Test
    public void pop() {
        SimpleStack stack = new Stack();
        Item item = new Item(1);
        stack.push(item);
        Item item2;
        item2 = stack.pop();
        assertSame(item,item2);
        assertEquals(0,stack.getSize());
    }
}