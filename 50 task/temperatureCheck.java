import java.util.Scanner;
public class temperatureCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = input.nextInt();

        if (temp > 30) {
            System.out.println("Hot!");
        } else if (temp >= 15) {
            System.out.println("Nice!");
        } else {
            System.out.println("Cold!");
        }
    }
}
