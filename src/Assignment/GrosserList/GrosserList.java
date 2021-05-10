package Assignment.GrosserList;

import java.util.ArrayList;
import java.util.Scanner;

public class GrosserList {
    ArrayList<String> grosserList = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);

    public void addItem(String item){
        grosserList.add(item);
    }

    public void removeItem(String item){
        int position = findItem(item);
        if(position >= 0) {
            removeItem(position);
        }
    }
    private void removeItem(int position){

        grosserList.remove(position);
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }
    private void modifyGroceryItem(int position, String newItem) {
        grosserList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }

    public void printGrosserList(){
        for(int i = 0; i < grosserList.size(); i++){
            System.out.println(i+1+":"+grosserList.get(i));
        }
    }

    private int findItem(String searchItem) {
        return grosserList.indexOf(searchItem);
    }


    public String searchItem(String item){
        if(grosserList.indexOf(item)>=0){
            System.out.println(item+" is in grosary list at position "+grosserList.indexOf(item));
            return item;
        }
        else
        {
            return null;
        }

    }



}
