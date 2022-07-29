package Dsa;

import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class StreamsAndLambdas {
    public static void main(String[] args) {
        SecureRandom sR = new SecureRandom();
        sR.ints(20,1,30);


//        System.out.println(IntStream.rangeClosed(1,20)
//                .filter(x->x%2==1).map(x->x*x*x).sum());
        String input = new Scanner(System.in).nextLine();
        input = input.toLowerCase();
        String[] elements = input.split((" "));

        List<String> stringList = Stream.of(elements)
                .sorted()
                .distinct().toList();
        System.out.println(stringList);
    }
}
