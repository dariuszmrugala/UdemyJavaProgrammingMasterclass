package section8.lect113;

public class BankClient {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addNewBranch("Wroclaw");
        bank.addCustomerToBranch("DarekZWroclawia", "Wroclaw", 100.0);
        bank.addTransaction("DarekZWroclawia", "Wroclaw", 300);
        bank.addCustomerToBranch("ZuitekZWroclawia", "Wroclaw", 0.0);
        bank.addCustomerToBranch("DarekZWroclawia", "Wroclaw", 0.0);
        bank.listCustomers("Wroclaw",true);

        bank.addNewBranch("Warszawka");
        bank.addCustomerToBranch("DarekZWarszawy", "Warszawka", 0.0);
        bank.listCustomers("Warszawka", false);

        bank.addNewBranch("Poznan");
        if(!bank.addCustomerToBranch("darek", "Poznan", 32.22)){
            System.out.println("Branch Poznan doesn't exist");
        }

//        bank.addNewBranch("Poznan");

        bank.addCustomerToBranch("darek", "Poznan", 33.0);

        bank.addCustomerToBranch("darek", "Poznan", 33.0);

        bank.listCustomers("Poznan", true);

    }
}
