package section8.ex45;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName) {
        this.name = bankName;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) != null) {
            return false;
        }
        return branches.add(new Branch(branchName));
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            return false;
        }
        return branch.newCustomer(customerName, initialAmount);
    }

    public boolean addCustomerTransaction(String branchName, String customerName,  double transatcionAmount) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            return false;
        }
        return branch.addCustomerTransaction(customerName, transatcionAmount);
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i < branches.size(); i++) {
            Branch branch = branches.get(i);
            if(branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }



    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            return false;
        }
        System.out.println("Customer details for branch " + branch.getName());
        ArrayList<Customer> customers = branch.getCustomers();
        for(int i = 0; i < customers.size(); i++) {
            System.out.println("Customer: " + customers.get(i).getName() + "[" + (i + 1) + "]");

            if(showTransactions) {
                ArrayList<Double> transactions = customers.get(i).getTransactions();
                System.out.println("Transactions");
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }

}
