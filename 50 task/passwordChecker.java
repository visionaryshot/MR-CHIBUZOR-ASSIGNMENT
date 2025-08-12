import java.util.Scanner;
public class passwordChecker {
    public static void main(String[] args) {
        String password = secret123;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String guess = input.nextLine();

        if (guess == password) {
            System.out.println("Access granted! Welcome!");
        } else {
            System.out.println("Access denied!");
        }
    }
}
