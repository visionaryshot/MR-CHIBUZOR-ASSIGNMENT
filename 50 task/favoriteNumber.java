import java.util.Scanner;
public class favoriteNumber {
    public static void main(String[] args) {
        int favorite = 7;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess my favorite number: ");
        int guess = input.nextInt();

        if (guess == favorite) {
            System.out.println("That’s my favorite number!");
        }
 else {
            System.out.println("Nice try, guess again!");
  }
 }
}
