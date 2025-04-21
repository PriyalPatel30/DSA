package assignment2_questions.Loops;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        double a =sc.nextInt();
         System.out.println("Enter number b: ");
         double b = sc.nextInt();

         double power = Math.pow(a, b);
         System.out.println("a^b is: "+power);
         sc.close();

    }
}
