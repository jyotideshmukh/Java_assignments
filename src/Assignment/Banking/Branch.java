package Assignment.Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }
    public String getName(){
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double amount){
        Customer customer = findCustomer(customerName);
        if(customer!=  null) {
            return false;
        }
            customer = new Customer(customerName,amount);
            customers.add(customer);
            return true;

    }
    public boolean addCustomerTransaction( String customerName, double amt){

            Customer customer = findCustomer(customerName);
            if(customer!=null) {
                customer.addTransaction(amt);
                return true;
            }
            return false;

    }

    public Customer findCustomer(String name){
        for(int i = 0; i < customers.size(); i++){
            Customer customer = customers.get(i);
            if(customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
   /* public void printCustomers(){
        for(int i = 0; i< customers.size(); i++){
            System.out.println("Customer: "+customers.get(i).getName()+"["+(i+1)+"]");
        }
    }

    public void printCustomersWithTransactions(){
        for(int i = 0; i< customers.size(); i++){
            Customer customer = customers.get(i);
            System.out.println("Customer: "+customer.getName()+"["+(i+1)+"]");
            System.out.println("Transactions");
            customer.printTransactions();
        }
    }*/

}
