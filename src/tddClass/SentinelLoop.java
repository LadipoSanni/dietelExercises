package tddClass;

import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {

        int count = 0;
        int x = count;
        System.out.println(x);
        System.out.println("enter a score or enter anything more than 100 to exit");

        while (count <= 100) {
            Scanner input = new Scanner(System.in);
            count = input.nextInt();
//        SecureRandom random = new SecureRandom();
            if (count<=0 || count>100) {
                    System.out.println("Score is Invalid");
            }else{
                    System.out.println("Score is Accepted");

            }
        }
    }
}
