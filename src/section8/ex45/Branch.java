package section8.ex45;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            return customers.add(new Customer(customerName, initialAmount));
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if(customer == null) {
            return false;
        }
        customer.addTransaction(amount);
        return true;

    }

    private Customer findCustomer(String name) {
        for(int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if(customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }


}
