Hello Vedant here

This Repo contians Java and DSA questions

#Topic 1: VARIABLES & DATA TYPES QUESTIONS

 Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
 these 3 numbers.
 (Hint : Average of N numbers is sum of those numbers divided by N)

 solution :
 import java.util.Scanner;

public class Average {
   public Average() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      int var4 = var1.nextInt();
      int var5 = (var2 + var3 + var4) / 3;
      System.out.println("Average is : " + var5);
   }
}

 Question 2: In a program, input the side of a square. You have to output the area of the
 square.
 (Hint : area of a square is (side x side))


 solution:

 
import java.util.Scanner;

public class AreaSquare {
   public AreaSquare() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      int var3 = var2 * var2;
      System.out.println("Area of Square is :" + var3);
   }
}

