package Array_det;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int size = num.nextInt(); 
        int[] arr = new int[size]; 

        System.out.println("Enter " + size + " integers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = num.nextInt(); 
        }

        System.out.println("You entered:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        
        num.close(); 
    }
}