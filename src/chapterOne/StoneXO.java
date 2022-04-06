package chapterOne;

public class StoneXO {
    public static void main(String[] args) {
        char[][] sign = new char[3][3];
        sign [0][0] = 'X';
        sign [0][1] = 'O';
        sign [0][2] = 'X';
        sign [1][0] = 'X';
        sign [1][1] = 'X';
        sign [1][2] = 'X';
        sign [2][0] = 'O';
        sign [2][1] = 'X';
        sign [2][2] = 'O';


        System.out.printf(" %c %c%n%c %c %c%n%c %c %c",sign[0][0],sign[0][1],sign[0][2],sign[1][1],sign[1][2],sign[2][0],sign[2][1],sign[2][2]);


    }
}
