package assignment2_questions.Loops;
import java.util.Scanner;
public class GCD_LCM {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number a ");
       int a = sc.nextInt();
       System.out.println("Enter number b ");
       int b = sc.nextInt();

        int gcd = 1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        System.out.println("GCD is : "+gcd);

        int lcm = (a*b)/gcd;

        System.out.println("LCM is : "+lcm);
        sc.close();
    }
}
