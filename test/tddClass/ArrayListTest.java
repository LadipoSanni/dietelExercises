package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    private MyArrayList myArraylist;
    @BeforeEach
    public void setup(){
        myArraylist = new MyArrayList();
    }

    @Test
    public void testIfArrayListExistTest(){
        assertNotNull(myArraylist);
    }
    @Test
    public void testThatArrayListIsZeroByDefault(){
        assertEquals(0, myArraylist.getSize());

    }
    @Test
    public void testThatSizeIncreasesAfterAddingItem(){
        myArraylist.add("seven");
        assertEquals(1,myArraylist.getSize());

    }
    @Test
    public void testThatMoreItemCanBeInsertedTest(){
        myArraylist.add("eight");
        myArraylist.add("seven");
        myArraylist.add("six");
        myArraylist.add("five");
        assertEquals(4,myArraylist.getSize());
    }
    @Test
   public void testThatItemCanBeRemovedTest(){
        myArraylist.add("eight");
        myArraylist.add("seven");
        myArraylist.add("six");
        myArraylist.add("five");
        myArraylist.remove("seven");
        assertEquals(3,myArraylist.getSize());
    }
    @Test
    public void testThatArrayCanBecomeArrayList(){
        myArraylist.add("eight");
        myArraylist.add("seven");
        myArraylist.add("six");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.getSize();
        assertEquals(7,myArraylist.getSize());
    }
    @Test
    public void testThatMoreItemCanBeAddedWhenItBecomesAnArrayList(){

        myArraylist.add("eight");
        myArraylist.add("seven");
        myArraylist.add("six");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("eight");
        myArraylist.add("seven");
        myArraylist.add("six");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.getSize();
        assertEquals(14,myArraylist.getSize());
    }
    @Test
    public void testThatWhenIPutAnItemInAnIndexItStaysInThatPositionAndReturnsTrue(){
        myArraylist.add("eight");
        myArraylist.add("seven");
        myArraylist.add("six");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.add("five");
        myArraylist.setItem(3,"I'm Here");
        assertEquals(8,myArraylist.getSize());
    }
//    @Test
//    public void testThatTheNewItemIsInTheIndexWhereIWantItToBe(){
//        myArraylist.add("eight");
//        myArraylist.add("seven");
//        myArraylist.add("six");
//        myArraylist.add("five");
//        myArraylist.add("five");
//        myArraylist.add("five");
//        myArraylist.add("five");
//        myArraylist.setItem(3,"I'm Here oo!");
//        assertEquals("I'm Here oo!",myArraylist.getItem(3));
//    }

}
