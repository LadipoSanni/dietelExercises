package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static tddClass.CrapGame.firstThrow;

public class CrapGameTest {
    @Test
    public void checkCrapCreationTest() {
        CrapGame crapGame = new CrapGame();
        assertNotNull(crapGame);
    }

    @Test
    public void checkIfDiceIsAvailableTest() {
        CrapGame crapGame = new CrapGame();
        assertNotNull(crapGame.sum);

    }


    @Test
    public void checkForFirstThrowWinTest() {
        CrapGame crapGame = new CrapGame();
        int die1 = crapGame.die1;
        int die2 = crapGame.die2;
        int sum = die1 + die2;
        int winLoosePoint= crapGame.firstThrow();
        assertEquals(winLoosePoint,crapGame.getSum());
    }
    @Test
    public void checkForFirstThrowLooseTest() {
        CrapGame crapGame = new CrapGame();
        if (crapGame.firstThrow() == 2||crapGame.firstThrow()==3||crapGame.firstThrow()==12) ;
        int[] looseFaces = new int[3];
        looseFaces[0] = 2;
        looseFaces[1] = 3;
        looseFaces[2] = 12;
        int[] firstThrowLoose = looseFaces;

        assertEquals(firstThrowLoose,looseFaces);
    }
//    @Test
//    public void checkPointToWinTest(){
//        CrapGame crapGame = new CrapGame();
//        int[] points = new int[7];
//        points[0] = 4;
//        points[1] = 5;
//        points[2] = 6;
//        points[3] = 8;
//        points[4] = 9;
//        points[5] = 10;
//        points[6] = 11;
//        int point = points[7];
//        if((firstThrow != crapGame.firstThrowWin()) || (firstThrow != firstThrowloose()) || firstThrow ==point ){
//            System.out.println("Throw"+points+"again to win");
//
//
//        }
//    }



}
