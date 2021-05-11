package Assignment.MobilePhone;

import java.util.Scanner;
import Assignment.MobilePhone.Contact;
import Assignment.MobilePhone.MobilePhone;

public class TestMainMobilePhone {
    public static MobilePhone mobilePhone = new MobilePhone("9673268978");
    public static Scanner scanner = new Scanner(System.in);

    //functions to check mobilephone
    public static void printChoice(){
        System.out.println("Enter your choice:");
        System.out.println("0 for print choice");
        System.out.println("1 for add contact in list");
        System.out.println("2 for print the contact list");
        System.out.println("3 for update contact from list");
        System.out.println("4 for remove contact from list");
        System.out.println("5 for search contact from list");
        System.out.println("6 to quit from program");
    }

    public static Contact createContact(){
        System.out.print("Enter name of Contact:");
        String name = scanner.nextLine();
        System.out.print("Enter phoneNumber of Contact:");
        String phoneNumber = scanner.nextLine();
        return Contact.createContact(name, phoneNumber);
    }
    public static void addContact(){
        Contact contact = createContact();
        if(mobilePhone.addNewContact(contact)){
            System.out.println("Contact added successfully");
        }
        else{
            System.out.println("Contact already exist");
        }
    }
    public static void updateContact(){
        System.out.println("Enter old Contact details:");
        Contact oldContact = createContact();
        System.out.println("Enter new Contact details:");
        Contact newContact = createContact();
        if(mobilePhone.updateContact(oldContact, newContact)){
            System.out.println(oldContact.getName()+" not exist");
        }
        else{
            System.out.println(oldContact.getName()+" changed to new contact"+newContact.getName());
        }
    }
    public static void removeContact(){
        Contact contact = createContact();
        if(mobilePhone.removeContact(contact)){
            System.out.println(contact.getName()+" removed successfully");
        }
        else{
            System.out.println(contact.getName()+ "not exist in list");
        }
    }

    public static void queryContact(){
        System.out.print("Enter name to search: ");
        String name= scanner.nextLine();
        Contact contact = mobilePhone.queryContact(name);
        if(contact != null){
            System.out.println("Contact " +contact.getName() + "->"+contact.getPhoneNumber()+ " is exist");
        }
        else
        {
            System.out.println("Contact with name "+name+ " is not exit in contact");
        }
    }
    public static void testmain(String args[]) {
        boolean flag = true;
        int choice;
        printChoice();
        //while loop for testing  mobilephone
        while (flag) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printChoice();
                    break;
                case 1:
                    addContact();
                    break;
                case 2:
                    mobilePhone.printContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
    }
}
