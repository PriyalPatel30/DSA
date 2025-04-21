package Hashmap;
import java.util.HashMap;
import java.util.Scanner;
public class ArrFrequencyHash {
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
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                int count = hashMap.get(arr[i]);
                count++;

                hashMap.put(arr[i], count);
            }

            else{
                hashMap.put(arr[i], 1);
            }

        }
        System.out.println(hashMap);
        sc.close();
    }
}
