import java.util.Scanner;

public class Fact {
    public static void main(String args[]) {
        System.out.println("Enter any number to find Factorial");
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of number is: " + fact);


    }
}
