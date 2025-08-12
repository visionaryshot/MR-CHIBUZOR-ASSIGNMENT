import java.util.Scanner;
public class magicNumber {
    public static void main(String[] args) {
        int magic = 42;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int guess = input.nextInt();

        if (guess == magic) {
            System.out.println("You found the magic number!");
        } else {
            System.out.println("Keep looking!");
        }
    }
}
