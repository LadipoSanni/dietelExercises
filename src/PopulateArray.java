public class PopulateArray {
    public static void main(String[] args) {
        int[] populate = new int[7];
        populate[0] = 2;
        populate[1] = 4;
        populate[2] = 6;
        populate[3] = 8;
        populate[4] = 10;
        populate[5] = 12;
        populate[6] = 14;

        int[][] multiDimension = {{2,3,7},
                                  {5,6,1,2,8},
                                  {4,9}};



        int sum = 0;

        for (int rowAdd = 0; rowAdd < multiDimension.length; rowAdd++) {
            for (int columnAdd = 0;  columnAdd < multiDimension[rowAdd].length; columnAdd++) {

                sum += multiDimension[rowAdd][columnAdd];
            }

        }
        System.out.println(sum);

    }
}
