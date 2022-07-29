package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private Queue que;
    @BeforeEach
    public void startUp(){
        que = new Queue();
    }


    @Test
    public void testThatQueueExistTest(){
        assertNotNull(que);
    }

    @Test
    public void testThatTheQueueHasAnIsEmptyMethodTest(){
        que.isEmpty();
    }
    @Test
    public void testThatTheIsEmptyMethodReturnsTrueWhenListIsEmptyTest(){
        assertTrue(que.isEmpty());
    }

    @Test
    public void testThatTheIsEmptyMethodIsNotEmptyWhenListNotEmptyTest(){
        que.joinQue("yemisi");
        assertFalse(que.isEmpty());
    }
    @Test
    public void testThatThePersonIsTheFirstInTheQueue(){
        que.joinQue("Tope");
        que.joinQue("Flo");
        que.joinQue("Advance");
        assertEquals("Tope",que.element());
    }
    @Test
    public void testThatTheElementInsertedIsInTheQueTest(){
        que.joinQue("Dolapo");
        assertEquals("Dolapo",que.remove());
    }
    @Test
    public void testForTheSizeOfTheQueueTest(){
        que.joinQue("Tobi");
        que.joinQue("Flo");
        que.joinQue("Tolani");
        que.joinQue("Asa");
        que.joinQue("Dolapo");
        que.joinQue("Ademola");
        que.joinQue("Shigun");
        que.joinQue("Adeola");
        que.joinQue("Airnest");
        que.joinQue("Oyinlola");
        assertEquals(10,que.size());
    }
}
