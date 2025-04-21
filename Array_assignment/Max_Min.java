package Array_assignment;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[]arr= new int[size];

        System.out.println("Enter "+size+" integers");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        // The first element of the array (arr[0]) is assigned to both max and min initially. 
        // This is because, at the start, we assume the first element is both the maximum and minimum.
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Maximum element is "+ max);
        System.out.println("Minimum element is "+ min);

        sc.close();
    }
}
