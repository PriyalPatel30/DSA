package Classwork;
import java.util.Scanner;
public class ArrFrequency2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] elements = new int[n];
        int[] count = new int[n];

        int index = 0;
        int frequency = 1;


        for (int i = 1; i < n; i++) {

            if (arr[i]==arr[i - 1]){
                frequency++;
            } else {
                elements[index] = arr[i - 1];
                count[index] = frequency;
                index++;

                frequency = 1;
            }
        }

        elements[index] = arr[n - 1];


        count[index] = frequency;
        index++;

        System.out.println("Elements appeared = Frequency:");
        for (int i = 0; i < index; i++) {
            System.out.println(elements[i] + " = " + count[i]);
        }

        sc.close();
    }
}