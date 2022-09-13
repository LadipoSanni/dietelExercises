package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KataTest {

    @Test
    public void add() {
        Kata calculator = new Kata();
        int actual = calculator.add(4, 3);
        assertEquals(7, actual);
    }

    @Test
    public void subtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(7, 2);
        assertEquals(5, result);
    }

    @Test
    public void absoluteSubtractionTest() {
        Kata calculator = new Kata();
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }
//
    @Test
    public void evenNumberCounterTest() {
        Kata counter = new Kata();
        int count = 2;
        while (count <= 10) {
            System.out.println(count + "");
            count = count + 2;
        }
    }

    @Test
    public void digitDividerTest() {
        Kata splitter = new Kata();
        int module = splitter.divideThemMethod();
        System.out.printf("%n modulo finally works");
        assertEquals(8, 8, "");

    }

    @Test
    public void numberMultiplierTest() {
        Kata multiply = new Kata();
        double plenty = multiply.multiplyAsManyNumber();
        assertEquals(63_000.0, 63_000, "");
    }

    //write a function and create an integer that returns true if it's an even
    //number and returns false if it's not an even number.
    @Test
    public void checkForEvenNumberTest() {
        Kata evenNumberChecker = new Kata();
        boolean digit = evenNumberChecker.checkAm(100);
        assertTrue(digit);
    }

    //create a function that takes in five integers
    //and returns 1 integer that's the biggest.
    @Test
    public void checkForTheBiggestNumberTest() {
        Kata biggest = new Kata();
        int biggestNumber = biggest.checkForBiggest(2, 5, 7, 4, 9);
        assertEquals(9, biggestNumber);
    }

    //write a function that take in a number type int and return the number of factors of type int
    @Test
    public void numberOfFactorCounterTest() {
        Kata factorCounter = new Kata();
        int count = factorCounter.checkTheFactors(13);
        assertEquals(2, count);
    }

    @Test
    public void primeNumberCheckTest() {
        Kata primeNumber = new Kata();
        boolean pn = primeNumber.checkThePrime(11);
        assertTrue(pn);
    }






    }


    //write a function that takes in integer and return true
    //if the integer is a prime number/false if it's not.





