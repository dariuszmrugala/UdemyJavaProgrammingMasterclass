package section8.lect112;

import java.util.ArrayList;

public class AutoBoxingTest {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }

        System.out.println(myArrayList);

        Integer myInteger = 3;
        System.out.println(myInteger.intValue());
    }
}
