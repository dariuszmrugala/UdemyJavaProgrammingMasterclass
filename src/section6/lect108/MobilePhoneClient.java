package section6.lect108;

import java.util.Scanner;

public class MobilePhoneClient {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone myMobilePhone = new MobilePhone();


        while(true) {
            showMenu();
            System.out.print("Take an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    return;
                case 2:
                    myMobilePhone.printListOfContacts();
                    break;
                case 3:
                    myMobilePhone.addNewContact();
                    break;
                case 4:
                    myMobilePhone.updateExistingContact();
                    break;
                case 5:
                    myMobilePhone.removeContact();
                    break;
            }
        }

//        myMobilePhone.addNewContact();
//        myMobilePhone.addNewContact();
//        myMobilePhone.printListOfContacts();

    }

    private static void showMenu() {
        System.out.println("1. Quit");
        System.out.println("2. Print list of contatcs");
        System.out.println("3. Add new contact");
        System.out.println("4. Update Existing Contact");
        System.out.println("5. Remove Contact");
    }


}
