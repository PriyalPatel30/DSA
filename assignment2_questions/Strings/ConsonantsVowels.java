package assignment2_questions.Strings;
import java.util.Scanner;
public class ConsonantsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String s = sc.nextLine();

        int countVowels=0;
        int countConsonants=0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    countVowels++;
                }
                else{
                    countConsonants++;
                }
                
            }
        }
        System.out.println("The string has vowels = "+countVowels+" and consonants = "+countConsonants);
        sc.close();
    }
}
