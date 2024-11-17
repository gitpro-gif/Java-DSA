import java.util.Scanner;

public class AreaSquare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Side = sc.nextInt();

        int AreaOfSquare = Side * Side ;
        System.out.println("Area of Square is :" + AreaOfSquare);
    }
}
