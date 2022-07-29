package tddClass.tictactoeGame;

import java.util.Scanner;

import static tddClass.tictactoeGame.MoveSigns.*;


public class Move{
    TicTacToeBoard board;

    public Move() {
        board = new TicTacToeBoard(1);
    }



    public void move(Scanner scanner){
        firstMove();
        nextMove();

    }

    private void nextMove() {
        if (!board.isEmpty()){
            System.out.println("Enter your Sign to continue:");
            board.move(scanner);
        }
        System.out.println("This Game is Over!");
    }

    Scanner scanner = new Scanner(System.in);

    public boolean firstMove(){
        if (board.isEmpty()) {
            System.out.println("select 1 if you would like to make the first move:" );
        }
        board.move(scanner);
        return true;
    }

    protected void getMoveSign(String sign) {
        String o = sign;
        String x = sign;
        o= String.valueOf(O);
        x= String.valueOf(X);
    }
}
