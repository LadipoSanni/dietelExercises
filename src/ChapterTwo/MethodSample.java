package ChapterTwo;

import java.util.ArrayList;

public class MethodSample {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();

        al.add("java");
        al.add('a');
        al.add('b');
        al.add("java");
        al.add(10.3);
        al.add('c');
        al.add(14);
        al.add("java");
        al.add(12);

        System.out.println("Before Duplicate Removal:" +al);

        for (int i = 0; i < al.size(); i++) {
            for (int j = i+1; j < al.size(); j++) {
                 if(al.get(i).equals(al.get(j))) {
                    al.remove(j);
                    j--;
                }

            }

        }
        System.out.println("After Removing Duplicate elements:" + al);
    }
//    int modCount = 0;
//    public <E> boolean add(E e) {
//        modCount++;
//        Object elementData = new Object();
//
//        add(e, elementData, size);
//        return true;
//    }
}

