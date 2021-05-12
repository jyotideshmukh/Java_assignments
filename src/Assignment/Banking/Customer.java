package Assignment.Banking;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions.add(transaction);
    }

    public void addTransaction(Double transaction){
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

   /* public void printTransactions(){
        for(int i=0 ; i< transactions.size() ; i++){
            double transaction = transactions.get(i).doubleValue();
            System.out.println("["+(i+1)+"] Amount "+transaction);
        }
    }*/

}
