import java.util.Scanner;
public class guessTheAnimal {
    public static void main(String[] args) {
        String myAnimal = dog;
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the animal: ");
        String guess = input.nextLine();

        if (guess == myAnimal) {
            System.out.println("Correct! It's a dog!");
        } else {
            System.out.println("Nope, it's a dog!");
        }
    }
}
