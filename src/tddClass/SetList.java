package tddClass;

public class SetList {


    private int count;
    private int[] box = new int[10];


    public boolean isEmpty() {
        return true;
    }

    public int add(int item){
        box[count] +=item;
        for (int i = 0; i < box.length; i++) {

        }
        return ++count;
    }

    public int size() {
        return count;
    }

}
