import java.util.Arrays;
import java.util.Arrays;
import java.util.Arrays;

public class Arraykata {
    public static void main(String[] args) {
    int[] values  = {34, 72, 22, 9, };
    int largest = Largest(values);
    System.out.println("The largest number is: " + largest);
    System.out.println("The smallest number is: " + Smallest  (values) );
    System.out.println("The total sum is : " + Sum  (values) );
    System.out.println("The total sum of Even Numbers is : " + SumOfEvenNumbers(values) );
    System.out.println("The total sum of Odd Numbers is : " + SumOfOddNumbers(values) );
    System.out.println("The Max and Min is : " +  Arrays.toString(MaxAndMin (values)) );
     System.out.println("The total numbers of even is : " +  noOfEvenNumbers  (values) );
     System.out.println("The total numbers of odd is : " +  noOfOddNumbers  (values) );
     System.out.println("The total even numbers  is : " +  Arrays.toString(getEvenNumbers(values)) );
     System.out.println("The total odd numbers  is : " +  Arrays.toString(getOddNumbers(values)) );
  System.out.println("The Square numbers  is : " +  Arrays.toString(squareNumbers(values)) );



    }

    public static int Largest(int[] array) {
        int largest = array[0];
	 for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
        largest = array[i];
 }
 }
        return largest;
 }


public static int Smallest(int [] array) {
	int smallest = array[0];
	 for (int i =1;  i < array.length; i++) {
	 if (array[i] < smallest) {
	 smallest = array[i];
}
}
return smallest;
}
	
public static int Sum (int[] array) {
int sum = 0;
for (int i = 0;  i < array.length; i++) {
sum = sum + array[i];
}

return sum;
}

public static int SumOfEvenNumbers(int[] array) {
int sumEven = 0;
for (int i = 0; i < array.length; i++) {
if  (array[i]  % 2 == 0){
sumEven = sumEven + array[i];
}
}
return sumEven ;
}

public static int SumOfOddNumbers(int[] array) {
int sumOdd = 0;
for(int i = 0; i < array.length; i++) {
if (array[i] % 2 != 0) {
sumOdd = sumOdd + array[i];
}
}
return sumOdd;
}

public static int[] MaxAndMin(int[] array) {
int smallest = array[0];
    int largest = array[0];

    for (int i = 1; i < array.length; i++) {
    if (array[i] < smallest) {
            smallest = array[i];
   }
        if (array[i] > largest) {
            largest = array[i];
        }
        }
    int[] maxAndMinArray = new int[] {largest, smallest};

    
    return maxAndMinArray;
}

public static int  noOfEvenNumbers(int[] array) {
int numEven = 0; 
for (int i = 0; i < array.length; i++) {
if (array[i] % 2 == 0 ) {
numEven++;
}
}
return numEven;
}

public static int  noOfOddNumbers (int[] array) {
int numOdd = 0;
for (int i = 0; i < array.length; i++) {
if (array[i] % 2 != 0 ) {
numOdd++;
}
}
return numOdd;
}

public static int[] getEvenNumbers(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0) {
            count++;
        }
    }

    int[] evenNumbers = new int[count];

 
    int index = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0) {
            evenNumbers[index] = array[i];
            index++;
        }
    }

    return evenNumbers;
}

public static int[] getOddNumbers(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 != 0) {
            count++;
        }
    }

    int[] oddNumbers = new int[count];

 
    int index = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 != 0) {
            oddNumbers[index] = array[i];
            index++;
        }
    }

    return oddNumbers;
}

public static int[] squareNumbers(int[] array) {
    int[] squares = new int[array.length];

    for (int i = 0; i < array.length; i++) {
        squares[i] = array[i] * array[i];
    }

    return squares;

}


















}



