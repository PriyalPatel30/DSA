package assignment2_questions.Conditional;

import java.util.Scanner;

public class ShopDiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items bought.");
        int items = sc.nextInt();

        System.out.println("Enter the total price.");
        int price = sc.nextInt();

        if(price>100 && items>=5){
            System.out.println("Discount applied is 10%");
            double discounted_price = price-(price/10);
            System.out.println("The amount to be paid is: "+discounted_price+"$");
        }
        else if(price<=100 && price>=50){
            System.out.println("Discount applied is 5%");
            double discounted_price = price-(price/5);
            System.out.println("The amount to be paid is:"+discounted_price+"$");
        }
        else{
            System.out.println("No discount applied");
        }
        sc.close();

    }
}
