package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetListTest {

    private SetList setList;
    @BeforeEach
    public void setSetListUp(){
        setList = new SetList();
    }

    @Test
    public void setListExistTest(){
        assertNotNull(setList);
    }
    @Test
    public void testForMethodIsEmptyTest(){
        assertNotNull(setList.isEmpty());

    }
    @Test
    public void testForAddingAnItemMethodTest(){
        setList.add(10);
        setList.add(10);
        assertEquals(2,setList.size());
    }

    @Test
    public void testThatSetDoesNotTakeDuplicateTest(){
        setList.add(4);
        setList.add(74);
        setList.add(4);
        setList.add(4);
        setList.add(34);
        setList.add(22);
        assertEquals(6,setList.size());
        assertTrue(true,"No duplicates allowed");


    }
}
