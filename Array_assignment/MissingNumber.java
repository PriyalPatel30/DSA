package Array_assignment;
import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int []arr = new int[n-1];

        System.out.println("Enter the array elements");
        for(int i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]!=arr[n-1]) {
                System.out.println("Missing element is : "+n);
            }
        }
        sc.close();
    }
}


