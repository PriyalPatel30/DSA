package assignment2_questions.Conditional;
import java.util.Scanner;
public class MobilePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes data used");
        double minutes = sc.nextInt();

        System.out.println("Enter the number of text messages sent in a month");
        double messages = sc.nextInt();

        
        //Plan A calculation
        double planA = 25;
        double costA;
        if(minutes<=100 && messages<=100){
            costA = planA;
        }

        else if (minutes > 100 && messages <= 100) {
            costA = planA + (minutes - 100) * 0.10;
        } 
        else if (minutes <= 100 && messages>100) {
            costA = planA + (messages - 100) * 0.05;
        } 

        else{
            costA = planA+(minutes-100)*0.10 +(messages-100)*0.05;
        }

        //Plan B calculation
        double planB = 40;
        double costB;
        if(minutes<=200 && messages<=200){
            costB = planB;
        }

        else if (minutes > 200 && messages <= 200) {
            costB = planB + (minutes - 100) * 0.08;
        } 
        else if (minutes <= 200 && messages>200) {
            costB = planB + (messages - 100) * 0.03;
        } 

        else{
            costB = planB+(minutes-100)*0.10 +(messages-100)*0.05;
        }

        //Plan C calculation
        double planC = 60;
        double costC = planC;
        
        System.out.println("Plan A cost is : $"+costA);
        System.out.println("Plan B cost is : $"+costB);
        System.out.println("Plan C cost is : $"+costC);

        
        String bestPlan ;
        double minCost ;
        if(costA<=costB && costA<=costC){
            bestPlan = "Plan A";
            minCost = costA;
        }
        else if(costB<=costA && costB<=costC){
            bestPlan = "Plan B";
            minCost = costB;
        }
        else{
            bestPlan="Plan C";
            minCost = costC;
        }
        System.out.println("The best plan based on your number of minutes and messages sent is : "+bestPlan+" = $"+minCost);
        sc.close();
    }
}
