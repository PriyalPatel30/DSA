package assignment2_questions.Strings;
import java.util.Scanner;
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");
        String s = sc.nextLine();

        System.out.println("Reversed string is :");
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        sc.close();
    }
}
