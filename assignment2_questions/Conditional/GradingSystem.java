package assignment2_questions.Conditional;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Maths out of 100");
        int Maths=sc.nextInt();

        System.out.println("Enter the marks of Science out of 100");
        int Science=sc.nextInt();

        System.out.println("Enter the marks of English out of 100");
        int English=sc.nextInt();

        double Average = (Maths+Science+English)/3;
        
        // conditions for marks

        if(Average>=90){
            System.out.println("Grade A");
        }

        else if(Average>=80 && Average<90){
            System.out.println("Grade B");
        }

        else if(Average>=70 && Average<80){
            System.out.println("Grade C");
        }

        else if(Average>=60 && Average<70){
            System.out.println("Grade D");
        }

        else if(Average<60){
            System.out.println("Grade F");
        }

        else
        System.out.println("Invalid Marks");
        sc.close();
    }
}
