import java.util.Scanner;
public class numberGuessingGame {
    public static void main(String[] args) {
        int secret = 8;
        Scanner input = new Scanner(System.in);
        int guess = 0;

        while (guess != secret) {
            System.out.print("Guess the number: ");
            guess = input.nextInt();

            if (guess == secret) {
                System.out.println("Correct!");
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
