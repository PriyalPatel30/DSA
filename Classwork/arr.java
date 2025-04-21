package Classwork;

// import java.util.Scanner;
// public class arr {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of the array");

//         int size = sc.nextInt();
//         int[]arr= new int[size];

        
//         System.out.println("Enter integer elements of the array");
//         for(int i=0;i<size;i++){
//             arr[i]=sc.nextInt();
         
//         }
//         System.out.print("The given array is : ");
//         System.out.print("[");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//             if (i<arr.length-1) {
//                 System.out.print(",");
//             }
//         }
//         System.out.print("]");
//         sc.close();
//     }
// }

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int[]arr= new int[size];

        // System.out.println("Enter k(target) value ");
        // int k = sc.nextInt();
        

        System.out.println("Enter "+size+" integer elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        System.out.println("Maximum element is "+ max);



        // int last = -1;
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i]==last){
        //         last = i;
        //     }
        // }
        
        // if(last != -1){
        //     System.out.println("last occurence of element is " +last + "is ");
        // }
        // else{
        //     System.out.println("Target k  not  ");
        // }




        // int move=0;
        // for (int i = 0; i < arr.length; i++) {
        //     k=0;
        //     if(arr[i]==k){
        //         move++;
        //         break;
        //     }
        // }

        // if(move>0){
        //         System.out.println("k is present");
        //                  }
        // else{
        //         System.out.println("k is not present");
        //         }





        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }

        // System.out.println("The sum of the array elements is : "+sum);
        sc.close();
    }
}
