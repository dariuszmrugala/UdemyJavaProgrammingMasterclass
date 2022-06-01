package section8.ex45;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.name = customerName;
        ArrayList<Double> transactions = new ArrayList<Double>();
        transactions.add(initialAmount);
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
         transactions.add(amount);
    }



}
