package assignment2_questions.Loops;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms (n)");
        int n = sc.nextInt();

        int prev = 0;
        int next = 1;

        System.out.println("Fib series for "+n+" terms is : ");
        for(int i = 0; i<=n; i++){
            System.out.print(prev +" ");

            int sum = prev+next;
            prev = next;
            next = sum;
        }
        sc.close();
    }
}



