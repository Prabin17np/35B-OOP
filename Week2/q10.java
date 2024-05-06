/*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

a. If equal to or more than 70 -> First Class

b. If more than 59 -> Upper Second Class

c. If more than 49 -> Second class

d. If more than 39 -> Third class and if below than 40 the result is fail. 

Hint: Use ternary operator */

import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Input marks of four subjects
        System.out.println("Enter marks of four subjects:");
        int subject1 = scan.nextInt();
        int subject2 = scan.nextInt();
        int subject3 = scan.nextInt();
        int subject4 = scan.nextInt();

        // Calculate total marks
        int totalMarks = subject1 + subject2 + subject3 + subject4;

        // Calculate percentage
        double percentage = (double) totalMarks / 4;
        
        // Determine the final result using ternary operator
        String message = (percentage>=70) ?"First Class":
                         (percentage>59) ?"Upper Second Class":
                         (percentage>49) ?"Second Class":
                         (percentage>39) ?"Third Class":"Fail";

         // Output total marks, percentage, and result
         System.out.println("Total Marks: " + totalMarks);
         System.out.println("Percentage: " + percentage + "%");
         System.out.println("Result: " + message);
         
         scan.close();


    }
    
}
