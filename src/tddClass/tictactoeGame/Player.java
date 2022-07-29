package tddClass.tictactoeGame;

import java.util.Scanner;

public class Player extends Move {
    Scanner scanner = new Scanner(System.in);
    Player player1 = new Player();
    Player player2 = new Player();

    public void setPlayer1(Player player1) {
        this.player1 = player1;
        player1.move(scanner);
    }

    public Player getPlayer1() {
        if (!firstMove()) {
            System.out.println("please enter a sign to start the game");;
        }
        return player1;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
        player2.move(scanner);
    }

    public Player getPlayer2() {
        if (firstMove()) {
            System.out.println("Player2, It's your turn now");

        }
        System.out.println("Enter your move to begin");
        return player2;
    }

}
