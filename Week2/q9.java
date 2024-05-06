/*9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Length");
        double length = scan.nextDouble();
        System.out.println("Breadth");
        double breadth = scan.nextDouble();
        double area = (length*breadth);
        int Rarea = (int) area;// Type Casting: double to int.
        
        System.out.println("Area of Rectangle is " + area);//without Type casting

        System.out.println("Area of Rectangle is: " +Rarea); 

        scan.close();
    }
    
}
