package Array_assignment;
import java.util.Scanner;
public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int []arr = new int[size];

        System.out.println("Enter the array elements along with zeroes");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length) {
            arr[index]=0;
           index++; 
        }

        System.out.println("Updated Array is : ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"");
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        sc.close();
     }
  }

