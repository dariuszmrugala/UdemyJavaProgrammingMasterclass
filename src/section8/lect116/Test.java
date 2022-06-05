package section8.lect116;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> myIntegerArrayList = new ArrayList<>();

        myIntegerArrayList.add(0);
        myIntegerArrayList.add(2);
        myIntegerArrayList.add(3);

        System.out.println(myIntegerArrayList);

        myIntegerArrayList.add(1,1);

        System.out.println(myIntegerArrayList);

        Iterator<Integer> i = myIntegerArrayList.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }



}
