import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {

    public static ArrayList<Contact> contactList = new ArrayList<>();

    public static void start(){
        Contact contact1 = new Contact("Zack", "604-999-8125", "557-234-6128", "", "Burnaby");
        Contact contact2 = new Contact("Oliver", "885-898-8758", "Nintendo Switch", "Mario World", "Burnaby");
        Contact contact3 = new Contact("Priscila", "452-523-6254", "Law", "Brentwood", "Burnaby");
        Contact contact4 = new Contact("Luffy", "123-568-7845", "Pirate", "One Piece", "All Blue");
        Contact contact5 = new Contact("John", "854-695-6852", "", "Canada","Vancouver");
        Contact contact6 = new Contact("Marie", "032-458-9653", "Java", "","Vancouver");
        Contact contact7 = new Contact("Anna", "845-632-8527", "Java", "Canada","");

        contactList.add(contact1);
        contactList.add(contact2);
        contactList.add(contact3);
        contactList.add(contact4);
        contactList.add(contact5);
        contactList.add(contact6);
        contactList.add(contact7);
    }

    public static String adddata() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scan.nextLine();
        while (name == null || name.isEmpty()) {
            System.out.println("Enter name:");
            name = scan.nextLine();
        }
        scan.reset();
        System.out.println("Enter mobile:");
        String mobile = scan.nextLine();
        while (mobile == null || mobile.isEmpty()) {
            System.out.println("Enter mobile:");
            mobile = scan.nextLine();
        }
        scan.reset();
        System.out.println("Enter work:");
        String work = scan.nextLine();
        scan.reset();
        System.out.println("Enter home:");
        String home = scan.nextLine();
        scan.reset();
        System.out.println("Enter city:");
        String city = scan.nextLine();

        Contact newContact = new Contact(name, mobile, work, home, city);
        if (!checkName(name)&& !checkNumber(mobile)){
            System.out.println("The contact already exists and cannot be created.");;
        }else{
            contactList.add(newContact);
            System.out.println("Successfully added a new contact!");
        }

        return "";
    }

    public static void allContact() {
        int num =0;
        for(Contact cont:contactList){
            System.out.println(num + ". " + cont.toString());
            num++;
        }
    }

    public static void removecontact() {
        allContact();
        Scanner scanner = new Scanner(System.in);
        boolean valid;
        do {
            System.out.println("Enter the index of contact to remove: ");

            int indexContactRemove = scanner.nextInt();

            if ((indexContactRemove > 0) && (indexContactRemove > contactList.size())){
                System.out.println("Invalid input. Enter a number between 0 and "+(contactList.size()-1));
                valid = false;
            } else {
                valid = true;
                String nameRemove = contactList.get(indexContactRemove).getName();
                contactList.remove(contactList.get(indexContactRemove));
                System.out.println("Successfully removed "+nameRemove);
            }
        }while (!valid);

    }

    public static void updatecontact() {
        allContact();

        Scanner scanner = new Scanner(System.in);
        boolean valid;
        do {
            System.out.println("Enter the index of the contact to update: ");
            int indexContactUpdate = scanner.nextInt();
            if ((indexContactUpdate > 0) && !(indexContactUpdate < contactList.size())){
                System.out.println("Invalid input. Enter a number between 0 and "+(contactList.size()-1));
                valid = false;
            } else {
                valid = true;
                contactList.get(indexContactUpdate).toString();

                Scanner scan = new Scanner(System.in);

                System.out.println("Enter name:");
                String name = scan.nextLine();
                System.out.println("Enter mobile:");
                String mobile = scan.nextLine();
                System.out.println("Enter work:");
                scan.nextLine();
                String work = scan.nextLine();
                System.out.println("Enter home:");
                String home = scan.nextLine();
                System.out.println("Enter city:");
                String city = scan.nextLine();

                Contact newContact = new Contact(name, mobile, work, home, city);

                contactList.set(indexContactUpdate,newContact);

                String nameUpdate = contactList.get(indexContactUpdate).getName();
                System.out.println("Successfully updated "+nameUpdate);
            }
        }while (!valid);
    }

    public static boolean checkName(String name){
        for (int i =0; i< contactList.size();i++){
            Contact myContact = contactList.get(i);
            if (name.equals(myContact.name)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkNumber(String number){
        for (int i =0; i< contactList.size();i++){
            Contact myContact = contactList.get(i);
            if (number.equals(myContact.getMobile())){
                return false;
            }
        }
        return true;
    }

}
