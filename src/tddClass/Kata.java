package tddClass;

public class Kata {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int result = 0;
        if (secondNumber > firstNumber) {
            result = secondNumber - firstNumber;
        }
        if (firstNumber > secondNumber) {
            result = firstNumber - secondNumber;
        }
        return result;
    }

    public double findAreaWith(int radius) {
        return (22 * radius * radius) / 7.0;
    }


    public int flip(int bit) {
        int result = 0;
        if (bit == 0) result = 1;
        if (bit == 1) result = 0;
        return result;
    }

    public void evenCounter() {

        int count = 0;

            while (count <= 10) {
                if (count % 2 == 0) {
                    System.out.print(count + "");
                }
                count = count + 1;
            }
        }
    public int divideThemMethod() {
        int result = 0;

        int firstNumber = 32;
        int secondNumber = 4;
        return result;

    }



    public double multiplyAsManyNumber() {
        double result = 0.0;

        double numberOne = 30;
        double numberTwo = 60;
        double numberFour = 5;
        double numberFive = 7;

        return result;
    }

    public boolean checkAm(int num) {
        if (num % 2 == 0) {
            return true;
        }else{

            return false;
        }

    }



    public int checkForBiggest(int i, int i1, int i2, int i3, int i4) {
        int biggestNumber;
        biggestNumber = i;
        if (i1 > biggestNumber) {
            biggestNumber = i1;
        }
        if (i2 > biggestNumber) {
            biggestNumber = i2;
        }
        if (i3 > biggestNumber) {
            biggestNumber = i3;
        }
        if (i4 > biggestNumber) {
            biggestNumber = i4;
        }
        return biggestNumber;


    }

    public int checkTheFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                count++;
            }

            }
            return count;
        }

    public boolean checkThePrime(int numbr) {
        int count = 0;

        for (int i = 1; i <= numbr; i++) {
            if (numbr % i == 0){
                count++;
            }
        }
        if(count<=2){
            return true;
        }
        return false;

    }
}

