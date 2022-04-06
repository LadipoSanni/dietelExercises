package tddClass;

import java.security.SecureRandom;
import java.util.Random;

public class PassWordGenerator {
    public static void main(String[] args) {

        String capitalLetter = "ABCDEFGHIJKLMNOPQRSYUVWXYZ";
        String smallLetter = "abcdefghijklmnopqrstuvwxyz";
        String numerics = "0123455789";
        String allPossibleChar = capitalLetter + smallLetter + numerics;

        char[] password = new char[12];

        Random random = new Random();
        for (int i = 0; i < 12; i++) {

         password[i] =   allPossibleChar.charAt(random.nextInt(allPossibleChar.length()));

        }
        System.out.println(password);
    }

}
