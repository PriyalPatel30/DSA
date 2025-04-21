// : Write a Java program to generate and print all Pythagorean triples where the numbers a, b, and c satisfy the condition a2+b2=c2 and a<b<c.
package assignment2_questions.Loops;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number a ");
        // int a = sc.nextInt();

        // System.out.println("Enter number b ");
        // int b = sc.nextInt();
        
        // System.out.println("Enter number c ");
        // int c = sc.nextInt();

        int limit = 100;
        for(int a=1;a<=limit-2;a++){
            for(int b=a+1;b<=limit-1;b++){
                for(int c=b+1;c<=limit;c++){   
  //here c=a+2 is not used as it violates the b<c condition in some cases such as a=10 b=99 so if c=a+2 then c=12 i.e b!<c
                   if((a*a + b*b == c*c) == true){
                    System.out.println(a+" "+b+" "+c);
                   }
                }
            }
        }
    }
}
