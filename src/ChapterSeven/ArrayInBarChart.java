package ChapterSeven;

public class ArrayInBarChart {
    public static void main(String[] args) {

        int[] arraylist = {0,0,0,0,6,2,4,8,6,4,2};

        System.out.println("Grade distribution: ");

        for (int counter = 0; counter < arraylist.length; counter++) {

            if(counter==10){
                System.out.printf("%5d: ",200);
            }
            else {
                System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
            }

            for (int stars = 0; stars < arraylist[counter]; stars++) {
                System.out.print("*");

            }
            System.out.println();



        }

    }
}
