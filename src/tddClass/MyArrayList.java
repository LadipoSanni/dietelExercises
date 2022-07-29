package tddClass;

public class MyArrayList{
    private int counter = 0;
    private String[] member = {"house","eight","car","nine","public"};
    String item;
    private int index = 0;

    public MyArrayList() {
        item = member[index];
    }


    public void setItem(String item) {
        this.item = item;
    }





    public int getSize() {
       return counter;
    }

    public void add(String item) {
        if (counter== member.length){
            member = new String[5+counter];
        }
        member[counter]=item;
        counter++;
    }

    public void remove(String item) {
        member[counter] = item;
        counter--;
    }


    public boolean setItem(int index, String item) {
        member[counter]=item;
        counter++;
        return true;
       }

    public String getItem(int indx) {
        this.index = indx;

        for (int counter = 0; counter < member.length ; counter++) {
            if (counter==index);
        }
            System.out.println("it's in the right spot");

        return item;
    }

}
//int[] arr = { 10, 20, 40, 50 };
//
//arr = Arrays.copyOf(arr, arr.length + 1);
//System.arraycopy(arr, i, arr, i + 1, arr.length - i - 1);
//arr[i] = 30;
//
//// arr == [ 10, 20, 30, 40, 50 ]
