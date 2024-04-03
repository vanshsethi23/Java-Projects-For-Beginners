import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        // Guess the number game (Mini Project)

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("Guess my number (1-100): ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("Wohoo.. Correct Number!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("The number guessed is too large!");
            } else {
                System.out.println("the number guessed is too small!");
            }
        } while(userNumber >= 0);

        System.out.println("My number was: " + myNumber);
    }
}