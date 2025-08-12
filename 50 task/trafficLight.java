import java.util.Scanner;
public class trafficLight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a color (red, yellow, green): ");
        String color = input.nextLine();

        if (color == "green") {
            System.out.println("Go!");
        } else if (color == "red") {
            System.out.println("Stop!");
        } else if (color == "yellow") {
            System.out.println("Wait!");
        } else {
            System.out.println("Wrong color!");
        }
    }
}
