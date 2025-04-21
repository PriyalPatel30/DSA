package array_leetcode_easy;

import java.util.Scanner;
public class Array_Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int arr2[]= new int[size*2];

        System.out.println("Enter "+size+" integer elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            arr2[i]=arr[i];
        }
        System.out.print("Concatenated array is : [");
        for(int i=arr.length;i<arr2.length;i++){
            arr2[i]=arr[i-arr.length];
        }
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]);
            // The if block limits that the comma(,) doesn't get printed after the last element of arr2[].
            if (i < arr2.length - 1) {
                System.out.print(",");
        }
      }
      
      System.out.println("]");
      sc.close();
    }
}



// To modify your code to print the concatenated array in a single line (like a proper array form) instead of printing each element on a new line, you can change the way you are using `System.out.println`. Instead of printing each element with brackets and new lines, you can print them in a more compact format.

// Here's how you can modify your code:

// ### Updated Code:
// ```java
// package array_leetcode_easy;

// import java.util.Scanner;

// public class Array_Concatenation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.println("Enter the size of the array");
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         int arr2[] = new int[size * 2];

//         System.out.println("Enter " + size + " integer elements of the array");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();
//             arr2[i] = arr[i];
//         }
        
//         // Concatenating the array
//         for (int i = arr.length; i < arr2.length; i++) {
//             arr2[i] = arr[i - arr.length];
//         }

//         // Print the concatenated array in a proper array format (single line)
//         System.out.print("Concatenated array is: [");
//         for (int i = 0; i < arr2.length; i++) {
//             System.out.print(arr2[i]);
//             if (i < arr2.length - 1) {
//                 System.out.print(", ");  // Add commas between elements
//             }
//         }
//         System.out.println("]");  // Closing the array with a bracket

//         sc.close();
//     }
// }
// ```

// ### Key Changes:
// 1. **Printing in a Single Line**: Instead of printing each element on a new line, the `System.out.print()` is used to print the elements continuously on the same line.
// 2. **Proper Array Format**: We surround the printed output with square brackets (`[` and `]`), and separate each element with commas and spaces to make it look like a standard array format.

// ### Example Output:

// For input:

// ```
// Enter the size of the array
// 3
// Enter 3 integer elements of the array
// 1 2 3
// ```

// The output will be:

// ```
// Concatenated array is: [1, 2, 3, 1, 2, 3]
// ```

// This will display the concatenated array in a proper, single-line format like `[1, 2, 3, 1, 2, 3]`.