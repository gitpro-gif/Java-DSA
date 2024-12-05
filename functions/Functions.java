package functions;

import java.util.Scanner;

public class Functions {

    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int calculateMul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void fact(int num) {
        int fact = 1;

        for(int i = num; i>= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
        
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
        
    }
}
