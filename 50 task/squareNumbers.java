public class squareNumbers {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 5) {
            int square = number * number;
            System.out.println(number + " squared is " + square);
            number = number + 1;
        }
    }
}
