public class Kata {
public static void main(String[] arg){


}


public static boolean isEven(int number){
if (number % 2 == 0) {
return(true);
}
else  {
return(false);
}

}



public static boolean isPrime(int number){
for (int p = 2; p <= Math.sqrt(number);p++){
if (number % p == 0) {
  System.out.print("false");
}
}

if (number <= 1) {
System.out.print("false");
}
return true;
}


public static int subtract(int number1,int number2){

int subtractor = Math.max (number1,number2);
int subtractee = Math.min (number1,number2);

int difference = subtractor - subtractee;
return difference;

 }



public static float divide(int number1, int number2){
if (number2 == 0){
return 0;
}
float result = (float) number1 / number2;
return result;

}


public static int factorOf(int number){
int factor = 0;
int f = 1;
for(f = 1; f <= number; f++){

if (number % f == 0){
   factor++;
}


}

return factor;
 }




public static int factorialOf(int number){
int f = 1;
int factor = 1;
while(f <= 5) {
factor = factor * f;
f++;
}
System.out.print(factor);
return number;
} 


public static int squareOf(int number) {
  
int result = number * number ;
return result;

}


public static boolean isSquare(int number){
if (Math.sqrt(number) * Math.sqrt(number) == number){
return (true);
}
else{
return (false);
}
}

}