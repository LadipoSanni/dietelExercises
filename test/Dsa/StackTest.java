package Dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    private  Stack stack;
    @BeforeEach
    public void normalMethod(){
        stack = new Stack();

    }

    @Test
    public void StackCanBeCreatedTest(){
        assertNotNull(stack);
    }
    @Test
    public void Stack_isEmpty(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushOneElement_stackIsNotEmptyTest(){
        stack.push(13);
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_stackShouldBeEmptyTest(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
    @Test
    public void pushXY_popX_stackShouldNotBeEmptyTest() {
        stack.push(13);
        stack.push(16);
        stack.pop();
        assertFalse(stack.isEmpty());
    }
    @Test
    public void pushX_popX_elementShouldBeXTest(){
        stack.push(34);
        int element = stack.pop();
        assertEquals(34,element);
    }
    @Test
    public void pushXandY_popYandX_elementIsYthenXTest( ){
        stack.push(34);
        stack.push(67);
        int element = stack.pop();
        assertEquals(67,element);
        element = stack.pop();
        assertEquals(34,element);
    }
    @Test
    public void pushXandY_peekReturnsYTest(){
        stack.push(32);
        stack.push(69);
        int element = stack.peek();
        assertEquals(69,element);
        element = stack.pop();
        assertEquals(69,element);
        element = stack.peek();
        assertEquals(32,element);
    }
}

