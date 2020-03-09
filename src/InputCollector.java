import java.util.ArrayList;
import java.util.Scanner;

public class InputCollector {

    public static int menu() {

    System.out.println(     "+===   Contact  App   ===+\n" +
                            "|  1. List all Contacts  |\n" +
                            "|  2. Add new Contact    |\n" +
                            "|  3. Remove Contact     |\n" +
                            "|  4. Update Contact     |\n" +
                            "|  5. Quit               |\n" +
                            "+========================+");


    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your option: ");
    while (true){
        switch (scan.nextInt()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                System.out.println("Invalid input, please enter a number between 1 and 5");
            }
        }
    }
}
