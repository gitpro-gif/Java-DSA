Hello Vedant here

This Repo contians Java and DSA questions

#Topic 1: VARIABLES & DATA TYPES QUESTIONS

 Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
 these 3 numbers.
 (Hint : Average of N numbers is sum of those numbers divided by N)

 solution :
 

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int Average = (A + B + C)/3 ;
        System.out.println("Average is : " + Average);
    }

 Question 2: In a program, input the side of a square. You have to output the area of the
 square.
 (Hint : area of a square is (side x side))


 solution:


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Side = sc.nextInt();

        int AreaOfSquare = Side * Side ;
        System.out.println("Area of Square is :" + AreaOfSquare);
    }


 Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

 solution:


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

 #Topic 2: CONDITIONAL STATEMENTS QUESTIONS
 
 Question1: WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
 positive or negative.

 solution:
 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }

Question2: FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperature
 is above 100 and otherwise prints You don't have a fever

 

    public static void main(String args[]) {
        double temp = 103.5;

        if(temp > 100) {
            System.out.println("You have fever");
        } else {
            System.out.println("You don't have fever");
        }
    }

Question3: Writea Javaprogramtoinputweeknumber(1-7)andprintdayofweekname
 using switch case.




    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1-7 to print number");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednasday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }
    }

   
Question 4 :What will be the value of x & y in thefollowing program
 
public class Solution {
 public static void main(String args[]) {
 int a = 63, b = 36;
 boolean x = (a < b ) ? true : false;
 int y= (a > b ) ? a : b;
 }
 }

Answer is: x = false, y = 63


Question5: WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthat
 year is a leap year or not.

 


 

