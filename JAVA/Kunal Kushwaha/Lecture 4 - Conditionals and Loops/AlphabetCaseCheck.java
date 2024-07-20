
import  java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
       /* // trim -> cuts all the extra spaces front and last of the chracater or string
        Scanner sc = new Scanner(System.in);
        // char c = sc.next();
        System.out.println(sc.next());
        // you can't give sc.next in char , you have to give it with charAt(0);
        String word = "hello";
        System.out.println(word.charAt(4)); */

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0); // this is the right way to take input in char.

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        }
        else if(ch >= 'A' && ch <= 'z'){
            System.out.println("UpperCase");
        }
        else{
            System.out.println("Not an Alphabet");
        }
         
        
         
    }
}
