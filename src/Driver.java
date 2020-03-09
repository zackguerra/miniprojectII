import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ContactList.start();
        boolean working = true;
        while (working) {

            switch (InputCollector.menu()) {
                case 1:
                    ContactList.allContact();
                    break;
                case 2:
                    System.out.println(ContactList.adddata());
                    break;
                case 3:
                    ContactList.removecontact();
                    break;
                case 4:
                    ContactList.updatecontact();
                    break;
                case 5:
                    System.out.println("\nBye!\n");
                    working = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + InputCollector.menu());
            }
        }
    }
}
