package Array_assignment;

public class Reverse_Array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println(+arr[i] + "  ");
        }

        System.out.println("Reversed array is: ");
        for(int i = arr.length-1; i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}
