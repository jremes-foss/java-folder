/*
 *
 *  Multiplication tables
 *  Demonstrates the usage of for-loops
 *
 */

 import java.util.Scanner;

 public class Multiply {
   public static void main(String[] args) {
     int x, y;
     System.out.println("Enter an integer:");
     System.out.print("> ");
     Scanner multiply = new Scanner(System.in);
     x = multiply.nextInt();
     System.out.println("Multiplication table of number "+x+" is:");

     // Multiply x * y, where y = 1,...,10. This is achieved most easily
     // with a simple for loop.

     for (y = 1; y <= 10; y++) {
       System.out.println(x+"*"+y+" = "+(x*y));
     }
   }
 }
