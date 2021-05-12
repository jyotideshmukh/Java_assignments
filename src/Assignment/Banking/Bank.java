package Assignment.Banking;

import java.util.ArrayList;

public class Bank {
    String name;
    private ArrayList<Branch> branches ;

    public Bank(String name) {
        this.name = name;
        this.branches =new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        //Branch branch = new Branch(name);
        if(findBranch(branchName) != null){
            return false;
        }
        Branch branch = new Branch(branchName);
        branches.add(branch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double transactionAmt){
        Branch branch = findBranch(branchName);
        if(branch!= null ) {
            if(branch.newCustomer(customerName,transactionAmt)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amt){
        Branch branch = findBranch(branchName);
        if(branch!= null ) {
            Customer customer = branch.findCustomer(customerName);
            if(customer!=null) {
                customer.addTransaction(amt);
                return true;
            }
            return false;
        }
        return false;
    }


    private Branch findBranch(String name){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName().equalsIgnoreCase(name)){
                return branches.get(i);
            }
        }
        return null;
    }
    private void printBranchName(Branch branch){
        System.out.println(branch.getName());
    }


    public boolean listCustomers(String branchName, boolean printTransaction){
        Branch branch = findBranch(branchName);
        if(branch!= null) {
            System.out.println("CUstomer details for branch "+ branchName);
            ArrayList customers = branch.getCustomers();
            if(printTransaction) {
                //branch.printCustomersWithTransactions();
                for(int i =0; i< customers.size();i++) {
                    Customer customer = (Customer) customers.get(i);
                    System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for(int j=0 ; j< transactions.size() ; j++){
                        double transaction = transactions.get(j).doubleValue();
                        System.out.println("["+(j+1)+"] Amount "+transaction);
                    }
                }
                return true;
            }
            else {
                //branch.printCustomers();

                for(int i =0; i< customers.size();i++) {
                    Customer customer = (Customer) customers.get(i);
                    System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                }
                return true;
            }

        }
        return false;

    }


}
