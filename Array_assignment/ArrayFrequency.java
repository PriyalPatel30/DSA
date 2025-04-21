// 6. Find the frequency of each element in an array.
package Array_assignment;

import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[]arr= new int[size];

        System.out.println("Enter "+size+" integer elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }

            if (i==0 || arr[i]!=arr[i-1]) {
                System.out.println(arr[i] + " appears " + count + " times");
                }
            }
        }
        sc.close();
    }
 }

