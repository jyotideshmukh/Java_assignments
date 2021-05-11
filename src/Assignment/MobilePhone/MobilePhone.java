package Assignment.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact){
        System.out.println("Checking for exiting contact:s"+findContact(contact));
        if(findContact(contact) >= 0){
            //System.out.println("Contact with "+contact.getName()+" already exit");

            return false;
        }

        myContacts.add(contact);
       // System.out.println("Contact"+ contact.getName()+ " added successfully");
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position < 0) {
            return false;
        }
        myContacts.set(position,newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position < 0) {
            return false;
        }
        myContacts.remove(position);
        return true;
    }

   /* public void editContact(String name, Contact contact){
        int position = findContact(name);
        if(position>=0)
            myContacts.set(position, contact);
        else {
            System.out.println("Contact with name " + name + " is not exist");
        }
    }

    public void editContact(Contact oldContact, Contact contact){
        int position = findContact(oldContact);
        if(position>=0) {
            myContacts.set(position, contact);
        }
        else{
            System.out.println("Contact with name " + oldContact.getName() + " is not exist");
            System.out.println("Do you want to add new contact Yes/No?");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")){
                myContacts.add(contact);
            }

        }
    }*/

    private int findContact(Contact contact){
        return findContact(contact.getName());
         //return myContacts.indexOf(contact);
    }

    private int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(name.equalsIgnoreCase(contact.getName())){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++){
            System.out.println((i+1)+": "+myContacts.get(i).getName()+" -> "+
                    myContacts.get(i).getPhoneNumber());
        }

    }
}
