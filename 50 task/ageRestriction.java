import java.util.Scanner;
public class ageRestriction {
    public static void main(String[] args) {
        int minimumAge = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= minimumAge) {
            System.out.println("Welcome to the show!");
        } else {
            System.out.println("Sorry, you're too young!");
        }
    }
}
