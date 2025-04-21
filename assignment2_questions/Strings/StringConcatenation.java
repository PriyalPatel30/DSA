package assignment2_questions.Strings;
import java.util.Scanner;
public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        String s1 = sc.nextLine();

        System.out.println("Enter second string");
        String s2 = sc.nextLine();

        String s3 = (s1+s2);
        System.out.println("The concatenated string is : "+s3);

        sc.close();
    }
}
