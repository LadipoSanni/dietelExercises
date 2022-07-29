package ChapterThree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomMathsQuiz {

    Random randomDigit = new Random();
    int firstNumber = randomDigit.nextInt();
    int secondNumber= randomDigit.nextInt();

    public int getFirstNumber(){
        return firstNumber;
    }
    public int getSecondNumber(){
        return secondNumber;
    }

    int userResponse;
    int correctAnswers;
    int wrongAnswers;

    char[] operator = new char[4] ;
    public void setOperator() {
       operator[0] = '+';
        operator[1] = '-';
        operator[2] = '/';
        operator[3] = '*';
        Random random = new Random(operator[0]);

   }
   public char getOperator() {
       return operator[0];
   }




    public static void main(String[] args) {

        RandomMathsQuiz mathsQuiz = new RandomMathsQuiz();
//        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int userResponse = input.nextInt();

        for (int question = 0; question < 10; question++) {

        }


        System.out.printf("%d,%s,%d " + "=",
                mathsQuiz.firstNumber,
                Arrays.toString(mathsQuiz.operator),
                mathsQuiz.secondNumber);
    }

}
