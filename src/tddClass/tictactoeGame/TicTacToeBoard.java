package tddClass.tictactoeGame;

import java.util.Arrays;
import java.util.Scanner;

import static tddClass.tictactoeGame.MoveSigns.Empty;

public  class TicTacToeBoard extends Move{

    Player player1 = new Player();
    Player player2 = new Player();
    Scanner scanner = new Scanner(System.in);
    int rows = 3;
    int columns = 3;
    int cells;

    {
        cells = rows * columns;
    }


    MoveSigns [][] elements = new MoveSigns[rows][columns];


      public TicTacToeBoard(int cells) {
          for (MoveSigns[] element : elements) Arrays.fill(element, Empty);

      }

    public boolean firstMove(){
        String empty = String.valueOf(Empty);
        player1.getMoveSign(x);
        player2.getMoveSign(o);
        String x = String.valueOf(MoveSigns.X);
        String o = String.valueOf(MoveSigns.O);
        board.isEmpty();
        System.out.println("Welcome to TicTacToeGame"+board.isEmpty(empty));
        System.out.println("Please Start the Game!"+scanner.hasNext());

        return true;
    }

    private boolean isEmpty(String empty) {
        board.isEmpty();

        return true;
    }

    public boolean isEmpty(){
        if (board.isEmpty()){
            System.out.println("Enter a sign");
        }else {
            System.out.println("Play a new Game");
    }
        return board.scanner.hasNext();

    }

    String empty = String.valueOf(Empty);
    String x = String.valueOf(MoveSigns.X);
    String o = String.valueOf(MoveSigns.O);


}
