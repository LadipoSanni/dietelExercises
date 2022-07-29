import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtle.Direction;
import turtle.Position;
import turtle.SketchPad;
import turtle.Turtle;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.SOUTH;

public class TurtleTest {
    private Turtle ijapa;
//    @BeforeEach
//    private SketchPad sketchPad;

    @BeforeEach
    public void startWith() {
        ijapa = new Turtle();
    }

    @Test
    public void turtleExistsTest() {
        assertNotNull(ijapa);
    }

    @Test
    public void turtlePenIsUpByDefault() {
        boolean isPenDown = ijapa.isPenDown();
        assertFalse(isPenDown);
    }

    @Test
    public void turtleCanMovePenDownTest() {
        assertFalse(ijapa.isPenDown());
        ijapa.penDown();
        boolean isPenDOwn = ijapa.isPenDown();
        assertTrue(isPenDOwn);
    }

    @Test
    public void turtleCanMovePenUpTest() {
        ijapa.penDown();
        ijapa.penUp();
        assertFalse(ijapa.isPenDown());

    }

    @Test
    public void turtleFaceEastByDefaultTest() {
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightFromEast() {
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

    }

    @Test
    public void turtleCanTurnRightFromWest() {
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFacingWest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.WEST,ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightFacingNorth(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(Direction.NORTH,ijapa.getCurrentDirection());
//turn right facing west and north
    }

    @Test
    public void turtleCanTurnLeftWhileFacingEast() {
        ijapa.turnLeft();
        assertEquals(Direction.NORTH,ijapa.getCurrentDirection());
    }
    //    facing north, west and south
    @Test
    public void turtleCanTurnLeftWhileFacingNorth(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(Direction.WEST, ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingWest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(Direction.WEST,ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingSouth(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(SOUTH,ijapa.getCurrentDirection());
    }

    @Test public void turtleCanMoveForwardFacingEastTest(){
//        ijapa.move(3);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());
    }
    @Test
    public void turtleCanMoveForwardFacingSouth(){
//        ijapa.move(6);
        assertEquals(new Position(0,5),ijapa.getCurrentPosition());
    }
//    @Test
//    public void turtleCanMoveForwardFacingSouthSmallSmall(){
//        ijapa.turnRight();
//        assertSame(SOUTH, ijapa.getCurrentDirection());
//
//        ijapa.move(3);
//        assertEquals(new Position(2,0),ijapa.getCurrentPosition());
//        ijapa.move(2);
//        assertEquals(new Position(3,0),ijapa.getCurrentPosition());
//
//    }
    @Test
    public void whenPenIsDown_turtleWriteFacingEast(){
        ijapa.penDown();
        SketchPad sketchPad = new SketchPad(5,5);

    }

//todo turtle can move facing west and east
}