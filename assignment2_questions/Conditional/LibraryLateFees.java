package assignment2_questions.Conditional;

import java.util.Scanner;

public class LibraryLateFees{
    public static void  main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the type of book to be returned.");

        System.out.println("1. Regular");

        System.out.println("2. Fiction");

        System.out.println("3. Reference");

        int book=sc.nextInt();

        System.out.println("Enter the number of overdue days.(example:3)");

        int days=sc.nextInt();

        // Condition for books

        if(book==1){
            double fine=days*0.50;
            System.out.println("Fees to be paid :"+fine+"$");
        }
        else if (book==2) {
            double fine=days*0.75;
            System.out.println("Fees to be paid :"+fine+"$");
            
        } 
        else if (book==3) {
            System.out.println("No late fees to be paid");
        }
        else {
            System.out.println("entered wrong type of book....Please try again");
            
        }
        sc.close();
    }
}