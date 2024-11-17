import java.util.Scanner;

public class Gst {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float Pencil = sc.nextFloat();
        float Pen = sc.nextFloat();
        float Eraser = sc.nextFloat();

        float total = (Pencil + Pen + Eraser);
        System.out.println("Toatal of 3 items are :" + total);

        float FinalToatl = total + (0.18f * total);
        System.out.println("Final cost of 3 product including gst is :" + FinalToatl);

    }
}
