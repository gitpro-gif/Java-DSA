import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input for size of arr1");
        int size1 = sc.nextInt();
        System.out.println("Input for size of arr2");
        int size2 = sc.nextInt();

        int arr1[] = new int[size1];
        int arr2[] = new int[size2];

        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int j = 0; j < size2; j++) {
            arr2[j] = sc.nextInt();
        }

        int totalSum = 0;

        for(int i =0; i < size1; i++) {
            totalSum += arr1[i];
        }

        for(int j = 0; j < size2; j++) {
            totalSum += arr2[j];
        }

        System.out.println("Sum of Two Array is" + totalSum);
    }
}