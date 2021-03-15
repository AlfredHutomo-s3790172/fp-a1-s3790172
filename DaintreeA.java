import java.util.Locale;
import java.util.Scanner;

public class DaintreeA {
    static Scanner input = new Scanner(System.in);
    static String[] bookTitles = {"Absolute Java", "JAVA: How to Program", "Computing Concepts with JAVA 8 Essentials", "Java Software Solutions", "Java Program Design"};
    static int[] numOfPhysicalCopies = {5, 0, 5, 5, 1};
    static boolean[] eBookVersion = {true, true, false, false, true};

    public static void main(String[] args) {
        DaintreeA dt = new DaintreeA();
    }

    public DaintreeA() {
        int[] shoppingCart = {};

        boolean running = true;

        System.out.println("\nWelcome to Daintree!\n");

        while (running) {
            printMenu();
            int userInput = input.nextInt();
            if (userInput == 0) {
                running = false;
            } else {
                checkInput(userInput);
            }
        }
    }

    public void printMenu() {
        System.out.println("Choose an option:");
        System.out.println("1. Add a book to shopping cart");
        System.out.println("2. View shopping cart");
        System.out.println("3. Remove a book from shopping cart");
        System.out.println("4. Checkout");
        System.out.println("5. List all books");
        System.out.println("0. Quit");
        System.out.print("Please make a selection: ");
    }

    public void checkInput(int input){
        switch (input){
            case 1:
                addBook();
                break;
            case 2:
                System.out.println("You input 2\n");
                break;
            case 3:
                System.out.println("You input 3\n");
                break;
            case 4:
                System.out.println("You input 4\n");
                break;
            case 5:
                System.out.println("You input 5\n");
                break;
            default:
                System.out.println("Sorry, that is an invalid option!\n");
                break;
        }
    }

    public void addBook(){
        System.out.print("Enter title to search for: ");
        String userInput = input.next();

        int[] indexOfBook = findBookIndex(userInput);


    }

    public int[] findBookIndex(String input){
        int bookIndexes

        for (int i = 0; i < bookTitles.length; i++){
            if(bookTitles[i].toLowerCase().startsWith(input.toLowerCase())){
                System.out.println(bookTitles[i]);
            }
        }


    }
}
