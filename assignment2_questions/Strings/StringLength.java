package assignment2_questions.Strings;
import java.util.Scanner;
public class StringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");
        String s = sc.nextLine();
        //nextLine captures the entire line along with the space
        System.out.println(s.length());
        sc.close();
    }

}
