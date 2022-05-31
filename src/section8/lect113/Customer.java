package section8.lect113;

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


    public boolean addTransaction(double amount) {
        return transactions.add(amount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void showTransactions() {
        System.out.print("{ ");
        for(int i = 0; i < transactions.size(); i++) {
            System.out.print(transactions.get(i) + ", ");
        }
        System.out.print(" }");
    }
}
