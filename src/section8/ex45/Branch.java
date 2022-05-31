package section8.ex45;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public boolean addCustomer(String customerName, double initialAmount) {
        if(findCustomer(customerName) == null) {
            return customers.add(new Customer(customerName, initialAmount));
        }
        System.out.println("Customer " + customerName + " has already exist. ");
        return false;
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

    private Customer findCustomers(Customer customer) {
        for(int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName() == customer.getName()) {
                return customers.get(i);
            }
        }
        return null;
    }

    public boolean addTransaction(Customer customer, double amount) {
        Customer findCustomer = findCustomers(customer);
        if(findCustomer == null) {
            System.out.println("couldn't find customer " + customer.getName() + " so, transaction couldn't be added");
            return false;
        }
        findCustomer.addTransaction(amount);
        return true;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer customer = findCustomer(customerName);
        if(customer == null) {
            System.out.println("Customer " + customerName + " does not exist");
            return false;
        }
        return customer.addTransaction(amount);

    }

    public String getName() {
        return name;
    }

    public void showCustomers(boolean showTransactions) {
        System.out.print("[ ");
        for(int i = 0; i < customers.size(); i++) {
            System.out.print(customers.get(i));
            if(showTransactions) customers.get(i).showTransactions();
        }
        System.out.print(" ]");

    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                '}';
    }
}
