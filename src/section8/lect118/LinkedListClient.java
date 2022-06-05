package section8.lect118;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList<String> myLinkedListOfStrings = new LinkedList<>();

        myLinkedListOfStrings.add("darek");
        myLinkedListOfStrings.add("ma");
        myLinkedListOfStrings.add("kota");


        LinkedList<String> myOrderedLinkedListOfString = new LinkedList<>();
        addInOrder(myOrderedLinkedListOfString, "darek");
        addInOrder(myOrderedLinkedListOfString, "barbara");
        addInOrder(myOrderedLinkedListOfString, "ada");
//        addInOrder(myOrderedLinkedListOfString, "ada");
        printList(myOrderedLinkedListOfString);

        goThroughList(myOrderedLinkedListOfString);
    }

    private static void printList(LinkedList<String> myLinkedListOfStrings) {
        Iterator<String> iterator = myLinkedListOfStrings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=========================================");
    }

    private static boolean addInOrder(LinkedList<String> myLinkedListOfStrings, String newEntry) {
        ListIterator<String> stringListIterator = myLinkedListOfStrings.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newEntry);
            if (comparison == 0) {
                System.out.println(newEntry + " exists in the Linked List");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newEntry);
                return true;
            } else if (comparison < 0) {

            }
        }
        stringListIterator.add(newEntry);
        return true;
    }

    private static void goThroughList(LinkedList<String> LinkedListOfStrings) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> stringListIterator = LinkedListOfStrings.listIterator();
        boolean goingForward = true;

        if (LinkedListOfStrings.isEmpty()) {
            System.out.println("Linked List is Empty");
            return;
        } else {
            if (stringListIterator.hasNext()) {
                System.out.println(stringListIterator.next());
                printMenu();
            }
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();


            switch (action) {
                case 0:
                    System.out.println("Over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward) {
                        if(stringListIterator.hasNext()) {
                            stringListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (stringListIterator.hasNext()) {
                        System.out.println(stringListIterator.next());
                    } else {
                        System.out.println("Reached the end of the Linked list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if(goingForward) {
                        if(stringListIterator.hasPrevious()) {
                            stringListIterator.previous();
                            goingForward = false;
                        }
                    }
                    if (stringListIterator.hasPrevious()) {
                        System.out.println(stringListIterator.previous());
                    } else {
                        System.out.println("We are at the start of the Linked List");
                        goingForward = true;
                    }


                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("0 quit");
        System.out.println("1 next");
        System.out.println("2 previous");
        System.out.println("3 show menu");
    }
}
