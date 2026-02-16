import java.util.Scanner;
import java.util.Random;

public class Game {
        public static void main(String[] args) {
        
        boolean playAgain = true;
        Random number = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game!\nI am thinking of a number between 1 and 100\nPlease select the difficulty of the game below."); 
        while (playAgain) {
            System.out.println("1. Easy (8 chances)\n2. Medium (4 chances)\n3. Hard (2 chances)");
            System.out.println("Enter your choice: ");
            while (!scanner.hasNextInt()) { 
                System.out.println("Please enter a number."); 
                scanner.next(); 
            }
            int choice = scanner.nextInt();
            while (choice > 3 || choice < 1) {
                System.out.println("Please enter a valid choice: ");
                choice = scanner.nextInt();
            }
            
            int chances;
            if (choice == 1) {
                chances = 8;
            }
            else if (choice == 2) {
                chances = 4;
            }
            else {
                chances = 2;
            }
            System.out.println("Good choice! You have selected difficulty number " + choice + ". Lets get this game started, shall we?");
            int num = number.nextInt(100) + 1;
            int guess;
            for (int i = chances; i > 0; i--) {
                System.out.println("Enter your guess (" + i + " chances left):");
                guess = scanner.nextInt();
                


                if (guess == num) {
                System.out.println("Congrats! You guessed the number!");
                break;
                } 
                else if (guess < num) {
                System.out.println("Too low!");
                } 
                else {
                System.out.println("Too high!");
                }

                if (i == 1) {
                    System.out.println("Game over! The number was " + num);
                }
            }
                scanner.nextLine(); 
                System.out.println("Would you like to play again? Please enter either yes or no.");
                String again;

                while (scanner.hasNextInt()) {
                    System.out.println("Please enter either yes or no: ");
                    scanner.nextLine();

                }
                
                again = scanner.nextLine().toLowerCase();
                
                while (!again.equals("yes") && !again.equals("no")) {
                    System.out.println("Please enter a valid answer: ");
                    again = scanner.nextLine();
                }
                if (again.equals("no")) {
                    playAgain = false;
                }
                

        }
           
    }
}
