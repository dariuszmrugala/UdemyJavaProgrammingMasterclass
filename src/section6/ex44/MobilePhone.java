package section6.ex44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact) > -1) {
            return false;
        }

        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position == -1) {
            return false;
        }
        myContacts.set(position,newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position == -1) {
            return false;
        }

        myContacts.remove(position);
        return true;
    }

    public Contact queryContact(String name) {
        return myContacts.get(findContact(name));
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for(int i = 0 ; i < myContacts.size(); i++) {
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {
        for(int i = 0 ; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName() == contact.getName()){
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        Contact contact = Contact.createContact(name,"");
        return findContact(contact);
    }


}
