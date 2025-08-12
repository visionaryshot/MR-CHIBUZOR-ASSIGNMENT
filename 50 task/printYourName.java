import java.util.Scanner;
public class printYourName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        int count = 1;
        while (count <= 3) {
            System.out.println(name + "!");
            count = count + 1;
        }
    }
}
