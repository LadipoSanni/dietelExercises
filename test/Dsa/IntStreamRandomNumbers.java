package Dsa;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class IntStreamRandomNumbers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        IntStream stream = secureRandom.ints(10,0,1001);
        long eventCount = stream.filter(x -> x % 2==0)
                            .count();

        long oddCount = stream.filter(x -> x % 2==1)
                .count();

        double evenAverage = stream.filter(x-> x % 2 == 0).average().orElse(0);
        double oddAverage = stream.filter(x-> x % 2 == 1).average().orElse(0);


    }
}
