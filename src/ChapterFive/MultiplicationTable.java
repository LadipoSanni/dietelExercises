package ChapterFive;


    public class MultiplicationTable {
        public static void main(String[] args) {
            System.out.println("                Multiplication Table");

            System.out.print("       ");
            for (int i = 1; i <= 12; i++)
                System.out.printf("%4d", i);


            System.out.println("\n------------------------------------------------------");
            for (int i = 2; i <= 12; i++) {
                System.out.print(i + "  *  ");
                for (int j = 1; j <= 12; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        }
    }

