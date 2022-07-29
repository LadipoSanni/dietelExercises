package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackListTest {

    private StackList stackList;
    @BeforeEach
    public void setUp(){
        stackList = new StackList();
    }

   @Test
   public void testForStackExistTest(){
       assertNotNull(stackList);
   }
   @Test
    public void testThatTheStackListHasAnIsEmptyMethodTest(){
       assertNotNull(stackList.isEmpty());

   }
   @Test
    public void testThatSomethingIsNotInTheListTest(){
       assertTrue(stackList.isEmpty());

   }
    @Test
    public void testThatSomethingIsInTheListTest(){
        stackList.push(7);
        assertFalse(stackList.isEmpty());
    }
    @Test
    public void testThatWhatIsInTheListIsWhatIPutThere(){
        stackList.push(7);
        assertEquals(7,stackList.peek());
    }
    @Test
    public void testThatWhenIPopTheRecentObjectIsRemovedTest(){
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        stackList.push(5);
        stackList.push(6);
        assertEquals(6,stackList.pop());
    }
    @Test
    public void testTheNewPopMethodWithArgTest(){
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        stackList.push(5);
        stackList.push(6);
        assertEquals(4,stackList.pop(4));
    }

}


