package tddClass;

public class ArrayLoad {
    public static void main(String[] args) {
        int[] loader = new int[300];
        for (int i = 0; i < loader.length; i++) {

            loader[i] =i + 1;
            System.out.println(loader[i]);
        }
//
//        for (int i = 0; i < loader.length; i++) {
//            System.out.println(loader[i]);
//            loader[i] += 1;
//        }
    }
}

