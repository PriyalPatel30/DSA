package Hashmap;
import java.util.Scanner;
import java.util.HashMap;
public class first_Repeating_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[]arr= new int[size];

        System.out.println("Enter integer elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                count = hashMap.get(arr[i]);
                count++;

                hashMap.put(arr[i], count);
            }

            else{
                hashMap.put(arr[i], 1);
            }

            
        }
        
        // Traversing through hashmap to get the value of the elemnbte which is only appearing once
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.get(arr[i])==1){
                System.out.println("Element which is occuring once is : "+arr[i]);
                break;
            }
        }
    }
}
