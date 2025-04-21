package Classwork;

public class ArrFrequency {
    public static void main(String[] args) {
        int []arr= {2,2,3,3,3,3};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }

                if(arr[i]!=arr[i-1]){
                    System.out.println("the count for the element "+arr[i]+"is ="+count);
                }
            }
        }
    }

}
