package Assignment.GrosserList;

import java.util.Scanner;
//import Assignment.GrosserList.GrosserList;
public class TestMainforGrosserList {
    public static GrosserList grosserList = new GrosserList();
    public static Scanner scanner = new Scanner(System.in);

    public static void printGrosserList() {
        System.out.println("Items in grosser list");
        grosserList.printGrosserList();
    }

    public static void addItemInList() {
        System.out.print("Enter Item:");
        grosserList.addItem(scanner.nextLine());
    }

    public static void removeItem() {
        System.out.print("Enter position from which you want to remove item");
        String item = scanner.nextLine();
        grosserList.removeItem(item);
    }

    public static void modifyItem() {
        System.out.print("Enter current item to modify");
        String currentItem = scanner.nextLine();
        System.out.println("Enter new Item");
        String item = scanner.nextLine();
        grosserList.modifyGroceryItem(currentItem, item);
    }

    public static void searchItem() {
        System.out.println("Enter item to search");
        String item = scanner.nextLine();
        grosserList.searchItem(item);
    }

    public static void printChoice() {
        System.out.println("Enter your choice:");
        System.out.println("0 for print choice");
        System.out.println("1 for add item in list");
        System.out.println("2 for print the items in list");
        System.out.println("3 for modify item from list");
        System.out.println("4 for remove item from list");
        System.out.println("5 for search item from list");
        System.out.println("6 to quit from program");
    }

    public static void mainTest(String args[]) {
        boolean flag = true;
        int choice;
        printChoice();
        while (flag) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printChoice();
                    break;
                case 1:
                    addItemInList();
                    break;
                case 2:
                    printGrosserList();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }
}