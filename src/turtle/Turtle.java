package turtle;

import static turtle.Direction.*;

public class Turtle {

    private Pen biro = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0,0);


    public boolean isPenDown() {
        return biro.IsDown();
    }
    public void penDown(){
        biro.penDown();

    }

    public void penUp() {
        biro.penUp();
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == SOUTH) currentDirection = WEST;
        else if (currentDirection == WEST) currentDirection = NORTH;
        else if (currentDirection == EAST) currentDirection = SOUTH;

    }

    public void turnLeft() {
        if (currentDirection == EAST) face(NORTH);
        else if (currentDirection == NORTH) face(WEST);
        else if (currentDirection==WEST) face(SOUTH);


    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }



    private void increaseColumnBy(int noOfSteps) {
        currentPosition.setColumn(noOfSteps-1);
    }


    public Position getCurrentPosition(){
        return currentPosition;
    }

    public void setCurrentPosition() {
    }


}
