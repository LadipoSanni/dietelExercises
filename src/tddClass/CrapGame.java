package tddClass;

import java.util.Random;
import java.util.Scanner;

public class CrapGame {

    public static Random throwDice() {
        return random;
    }

    public static int firstThrow;
    public static int firstThrowLoose;
    public static int firstThrowWin;


    public void firstThrowWin() {
        int [] wins = new int[2];
        wins[0] = 7;
        wins[1] = 11;
        int[] winPoint = wins;

    }
    static Random random = new Random();
    Scanner typeIn = new Scanner(System.in);

    public int die1 = random.nextInt(1,7);
    public int die2 = random.nextInt(1,7);

    public int sum = die1 + die2;



    public int firstThrow() {


        if (sum == 7 || sum == 11) {
            sum = die1 + die2;
            System.out.println("You Win!");
        }
        else {
            if (firstThrow == 4||firstThrow==5||firstThrow==6||firstThrow==8||firstThrow==9||firstThrow==10||firstThrow==11) {
                System.out.println(sum +"is your Point, Throw dice again to get this point to win");

            }
            else {
                System.out.println("You loose!");
            }


        }
        return sum;
    }

    public int setThrowLoose(int sum) {
        if(sum==2||sum==3||sum==12){
            System.out.println("You Loose!");
        }
        return sum;
    }

    public int getSum() {
        return  sum;
    }

    public void diceLooseFace() {
        int [] looseFace = new int[3];
        looseFace[0] = 2;
        looseFace[1] = 3;
        looseFace[2] = 12;

    }



}
