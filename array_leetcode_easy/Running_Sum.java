package array_leetcode_easy;
    import java.util.Scanner;
public class Running_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[]arr= new int[size];

        System.out.println("Enter integer elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        int sum=0;
        System.out.print("Running sum of Array is : [");
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
            System.out.print(sum);
            if(i<arr.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");
        sc.close();
    }

}
