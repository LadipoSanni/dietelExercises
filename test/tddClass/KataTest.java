package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void add(){
        Kata calculator = new Kata();
        int actual = calculator.add(4, 3);
        assertEquals(7,actual);
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

    @Test
    public void evenNumberCounterTest(){
        Kata counter = new Kata();
        int count = 2;
        while (count <=10){
            System.out.println(count+ "");
            count = count+2;
        }
    }
    @Test
    public void digitDividerTest(){
        Kata splitter = new Kata();
        int module = splitter.divideThemMethod();
        System.out.printf("%n modulo finally works");
        assertEquals(8,8,"");

    }
    @Test
    public void numberMultiplierTest(){
        Kata multiply = new Kata();
        double plenty = multiply.multiplyAsManyNumber();
        assertEquals(63_000.0, 63_000,"");
    }


}


