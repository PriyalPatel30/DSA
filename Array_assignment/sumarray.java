// 7. Find the sum of all elements in an array.
package Array_assignment;

import java.util.Scanner;

public class sumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[]arr= new int[size];

        System.out.println("Enter "+size+" integer elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }

        System.out.println("The sum of the array elements is : "+sum);
        sc.close();
    }
}
