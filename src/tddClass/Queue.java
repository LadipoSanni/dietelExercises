package tddClass;

public class Queue {
    private int persons;
    public String[] peoplesName = new  String[10];

    public boolean isEmpty() {
        return persons == 0;
    }


    public void joinQue(String person) {
        peoplesName[persons] = person;
        persons +=1;
    }


    public String element() {
        return peoplesName[0];
    }

    public String remove() {
        persons--;
        return peoplesName[0];
    }
    public int size(){
        return persons;
    }
}
