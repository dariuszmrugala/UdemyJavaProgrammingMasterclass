package section8.lect117;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList<String> myLinkedListOfStrings = new LinkedList<>();

        myLinkedListOfStrings.add("darek");
        myLinkedListOfStrings.add("kota");

        System.out.println(myLinkedListOfStrings);


        myLinkedListOfStrings.add(1, "ma");
        Iterator<String> iterator = myLinkedListOfStrings.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
