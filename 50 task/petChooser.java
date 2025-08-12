import java.util.Scanner;
public class petChooser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite pet: ");
        String pet = input.nextLine();

        if (pet == "dog") {
            System.out.println("Woof! Dogs are awesome!");
        } else {
            System.out.println("Cool choice, but I love dogs!");
        }
    }
}
