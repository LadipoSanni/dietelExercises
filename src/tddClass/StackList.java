package tddClass;

public class StackList {
     private int numberOfItems;
     public int[] num = new int[8];


    public boolean isEmpty(){
        return numberOfItems == 0;
    }


    public void push(int item) {
        num[numberOfItems] = item;
        numberOfItems++;

    }

    public int peek() {
        return num[numberOfItems -1];
    }
    public int pop(){
        numberOfItems--;
        return num[numberOfItems];
    }
    public int pop(int obj){
        int newItem = obj;
        obj = num[numberOfItems-newItem];
         numberOfItems--;
        return newItem;
    }
}
