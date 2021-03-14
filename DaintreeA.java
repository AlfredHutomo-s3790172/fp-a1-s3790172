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
                System.out.println("You input 1");
                break;
            case 2:
                System.out.println("You input 2");
                break;
            case 3:
                System.out.println("You input 3");
                break;
            case 4:
                System.out.println("You input 4");
                break;
            case 5:
                System.out.println("You input 5");
                break;
            default:
                System.out.println("Enter only 1,2,3,4,5,0");
                break;
        }
    }
}
