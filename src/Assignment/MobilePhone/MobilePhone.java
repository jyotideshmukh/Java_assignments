package Assignment.MobilePhone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MobilePhone {

    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public boolean addContact(Contact contact){
        if(findContact(contact)>=0){
            System.out.println("Contact with "+contact.getName()+" already exit");
            return false;
        }
        contactList.add(contact);
        System.out.println("Contact"+ contact.getName()+ " added successfully");
        return true;
    }

    public void editContact(String name, Contact contact){
        int position = findContact(name);
        if(position>=0)
            contactList.set(position, contact);
        else {
            System.out.println("Contact with name " + name + " is not exist");
        }
    }

    public void editContact(Contact oldContact, Contact contact){
        int position = findContact(oldContact);
        if(position>=0) {
            contactList.set(position, contact);
        }
        else{
            System.out.println("Contact with name " + oldContact.getName() + " is not exist");
            System.out.println("Do you want to add new contact Yes/No?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")){
                contactList.add(contact);
            }

        }
    }

    private int findContact(Contact contact){
         return contactList.indexOf(contact);
    }

    private int findContact(String name){
        for(int i = 0; i < contactList.size(); i++){
            Contact contact = contactList.get(i);
            if(name.equalsIgnoreCase(contact.getName()){
                return i;
            }
        }
        return -1;
    }
}
