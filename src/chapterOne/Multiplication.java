package chapterOne;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digit");
        int digit = input.nextInt();
        int i = 1;

        while( i <= 12){
            i++;
            int answer = digit * i;
            System.out.println(digit +"X" +i +"=" +answer);
        }
        System.out.println();


    }
}
