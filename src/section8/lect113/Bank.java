package section8.lect113;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public boolean addNewBranch(String name) {
        if(findBranch(name) != null) {
            System.out.println("Branch " + name + " has already exists.");
        }
        return branches.add(new Branch(name));
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

    public boolean addCustomerToBranch(String customerName, String branchName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            System.out.println("Branch " + branchName + " does not exist");
            return false;
        }
        return branch.addCustomer(customerName, initialAmount);
    }

    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            System.out.println("Branch " + branchName + " does not exist");
            return;
        }

        branch.showCustomers(showTransactions);

    }

//    public void listCustomers(String nameBranch, boolean showTransactions) {
//        Branch branch = findBranch(nameBranch);
//        if(branch == null) {
//            System.out.println("Branch " + nameBranch + " does not exists");
//        }
//        branch.showCustomers(showTransactions);
//    }

    public boolean addTransaction(String customerName, String branchName, double transatcionAmount) {
        Branch branch = findBranch(branchName);
        if(branch == null) {
            System.out.println("Branch " + branchName + " does not exist");
            return false;
        }
        return branch.addTransaction(customerName, transatcionAmount);
    }


}
