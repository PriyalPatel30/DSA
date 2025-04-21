package assignment2_questions.Strings;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String s = sc.nextLine();

        int flag = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("the given string is not a palindrome");

        }
        else{
            System.out.println("the given string is a palindrome");
        }
        sc.close();
    }
}
