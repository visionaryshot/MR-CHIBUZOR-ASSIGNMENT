import java.util.Scanner;
public class largest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter any number: ");
int num1 = input.nextInt();

int min = num1;
int max = num1;
int count = 1;
while (count < 5) {
System.out.print("Enter any number:");
int num = input.nextInt();

if (num > max) max = num;
if (num < min) min = num;
 
count++;           
}
System.out.println("Smallest number: " + min);
System.out.println("Largest number: " + max);
 }
}

