package Array_assignment;
    import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[]arr= new int[size];

        System.out.println("Enter "+size+" integer elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        int a=0;
        for(int i=0;i<arr.length;i++){
            // (size-1) WRONG!
            //--> It isnt used as it always checks the current element with the last element and miss comparisons like arr[1] with arr[3]
            if(arr[i]==arr[arr.length-1-i]){            
                a++;    
            }
        }

        if(a==1){
            System.out.println("The given array is not a palindrome");
        }
        else{
            System.out.println("The given array is a palindrome");
        }
        sc.close();
    }
}
