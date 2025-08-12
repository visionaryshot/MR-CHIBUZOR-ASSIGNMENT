public class sumOfNumbers {
    public static void main(String[] args) {
        int total = 0;
        int number = 1;
        while (number <= 10) {
            total = total + number;
            number = number + 1;
        }

        System.out.println("The sum is: " + total);
    }
}
