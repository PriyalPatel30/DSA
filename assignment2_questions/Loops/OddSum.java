package assignment2_questions.Loops;

public class OddSum {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1 ; i<=100 ; i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of first 100 odd numbers is = "+sum);

    }
}
