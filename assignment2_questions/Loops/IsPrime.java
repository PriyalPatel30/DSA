package assignment2_questions.Loops;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100 :");
        int x=sc.nextInt();

        if (x < 1 || x > 100) {
            System.out.println("Invalid input. Please enter a number between 1 and 100.");
        }

        // 1 is not prime
        if (x == 1) {
            System.out.println("The given number is not a prime number.");
        }

        // flag is initialized to 0 and is used to track whether the number has any divisors other than 1 and itself.
        int flag=0;
        
        for(int i=2 ; i<x ; i++){
            if (x%i==0) {
                flag++;
                break;
            }
        }
        if(flag == 1){
            System.out.println("The given number is not a prime number.");   
            //If flag == 1, it means the number was divisible by at least one number other than 1 and itself, so it's not prime.
        }

        else{
            System.out.println("The given number is a prime number.");
            // If flag is still 0, it means no divisors were found, so the number is prime.
            }
        sc.close();
        }
     }
