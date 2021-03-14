import java.util.Scanner;

public class DaintreeA {
    public static void main(String[] args) {
        DaintreeA dt = new DaintreeA();
    }

    public DaintreeA() {
        String[] bookTitles = {"Absolute Java", "JAVA: How to Program", "Computing Concepts with JAVA 8 Essentials", "Java Software Solutions", "Java Program Design"};
        int[] numOfPhysicalCopies = {5, 0, 5, 5, 1};
        boolean[] eBookVersion = {true, true, false, false, true};

        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("\nWelcome to Daintree!\n");

        while (running) {
            printMenu();
            int userInput = input.nextInt();
            System.out.println("You input " + userInput + "\n");
            if (userInput == 0) {
                running = false;
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
}
