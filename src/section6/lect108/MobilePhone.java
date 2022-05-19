package section6.lect108;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public MobilePhone() {

    }

    public MobilePhone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addNewContact() {
        System.out.println("Give a name:");
        String name = scanner.nextLine();
        System.out.println("Give a phone number");
        String phoneNumber = scanner.nextLine();

        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
    }

    public void printListOfContacts() {
        System.out.println(contacts.toString());
    }

    public void updateExistingContact() {
        System.out.print("Which contact should be changed:");
        String name = scanner.nextLine();
        int i = doesContactExisting(name);
        if( i > -1) {
            System.out.println("Give a name:");
            String newName = scanner.nextLine();
            System.out.println("Give a phone number");
            String phoneNumber = scanner.nextLine();

            contacts.get(i).setName(newName);
            contacts.get(i).setPhoneNumber(phoneNumber);
        }

    }

    private int doesContactExisting(String name) {
        System.out.println(name);
        for(int i = 0; i < contacts.size(); i++) {
            System.out.println(i + ", " + contacts.get(i).getName());
            if (contacts.get(i).getName().equals(name)) {
                System.out.println(name + " exists and it's " + i + "th element of contacts");
                return i;
            }
        }
        return -1;
    }

    public void removeContact() {
        System.out.print("Which contact should be removed:");
        String name = scanner.nextLine();
        int i = doesContactExisting(name);
        if(i > -1)
            contacts.remove(i);
    }

}
