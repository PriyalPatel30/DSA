package array_leetcode_easy;

import java.util.Scanner;

public class Richest_Customer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Main Array Input
        System.out.println("Enter the number of customers (main array)");
        int m = sc.nextInt();

        System.out.println("Enter the number of banks for each customer (sub-array)");
        int n = sc.nextInt();

        int [][]arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            System.out.println("Enter the bank-wise wealth of each Customer "+(i+1));
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("");

        // Array Printing
        System.out.print("The Customer Wealth Array is : ");
        System.out.print("[");
        for(int i=0;i<m;i++){
            System.out.print("[");
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+"");
                    if(j<n-1){
                        System.out.print(",");
                }
            }
            System.out.print("]");
                    if(i<m-1){
                    System.out.print(",");
                }
        }
        System.out.println("]");

        System.out.println("");

        // Sum Calculation & Comparison
        int max = 0;
        int customer = 0;
        for(int i=0;i<m;i++){
            System.out.print("The wealth of Customer "+(i+1)+" = ");
            int sum = 0;
            for(int j=0;j<n;j++){
                sum = sum+arr[i][j];
            }
            System.out.println(sum);
            if (sum>max) {
                max = sum;
                customer=(i+1);
            }
            System.out.println("");
        }
        System.out.println("Customer "+customer+" is the richest with a wealth of "+max+".");
        
        sc.close();
    }
}

        // int []arr1= new int[n];
        // int []arr2= new int[n];
        // int []arr3= new int[n];

        // System.out.println("Enter the first input array of money");
        // for(int i=0;i<arr1.length;i++){
        //     arr1[i]=sc.nextInt();
            
        // }

        // System.out.println("Enter the second input array of money");
        // for(int i=0;i<arr2.length;i++){
        //     arr2[i]=sc.nextInt();
        // }  

        // System.out.println("Enter the third input array of money");
        //  for(int i=0;i<arr3.length;i++){
        //     arr3[i]=sc.nextInt();
        // }
        // int[][]main_arr= new int[3][n];

        //   main_arr[0]=arr1;
        //   main_arr[1]=arr2;
        //   main_arr[2]=arr3;




        //   for(int i=0;i<main_arr.length;i++){
        //     for (int j = 0; j < main_arr.length; j++) {
        //         System.out.print(main_arr[i][j]);
        //     }
        //     System.out.println();
        //   }
