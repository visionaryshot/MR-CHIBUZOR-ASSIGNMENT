import java.util.Scanner;

public class passwordRetry {
    public static void main(String[] args) {
        String correctPassword = python;
        Scanner input = new Scanner(System.in);
        int trial = 0;
        boolean success = false;

        while (trial < 3) {
            System.out.print("Enter password: ");
            String guess = input.nextLine();

            if (guess == correctPassword) {
                System.out.println("Success!");
                success = true;
                break;
            } else {
                System.out.println("Try again!");
            }

            trial = trial + 1;
        }

        if (!success) {
            System.out.println("Locked out!");
        }
    }
}
