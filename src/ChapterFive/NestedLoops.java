package ChapterFive;

public class NestedLoops {
    public static void main(String[] args) {
        NestedLoops nLoops = new NestedLoops();
        for (int i = 1; i <= 12; i++) {
            for (int j = 2; j <=12; j++) {
                System.out.printf("%2d * %2d = %2d   ", j,i, i * j);

            }
            System.out.println("  ");
        }
    }
}
//
//int i = 1;
//    while (i <= 12) {
//        int j = 2;
//        while (j <= 12) {
//            j++;
//        }
//        i++;
//    }
//        System.out.println(i);
//        System.out.println();
//    }
//}