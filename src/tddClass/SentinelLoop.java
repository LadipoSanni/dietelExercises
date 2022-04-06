package tddClass;

import java.security.SecureRandom;
import java.util.Scanner;

public class SentinelLoop {
    public static void main(String[] args) {

    int count = 0;
    while(count <= 100){
        Scanner input = new Scanner(System.in);
//        SecureRandom random = new SecureRandom();
        System.out.println("enter a score or enter anything more than 100 to exit");
        count = input.nextInt();
        System.out.println("Score Accepted");

    }
    }
}

