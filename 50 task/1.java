import java.util.Scanner;

public class GreetingChooser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        if (name == "Alex") {
            System.out.println("Hello, friend!");
        } else {
            System.out.println("Hi, stranger!");
        }
    }
}
