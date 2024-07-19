import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("please enter some input");
//        int rollNo = sc.nextInt();
//        System.out.println("your rool number is " + rollNo);
        int a = 10;
        /* here 10 is a litreal
        litreals are the syntatical representaions of like boolean charater and
         a = identifier (reference variable)
        ANY name that works as a variable is identifier. */

        // How will you write million dollar number woth Integer.
//        int x = 234,000,000;  -> wrong syntax;
        int x = 234_000_000; // this is the right syntax;
        System.out.println(x);

        float marks = sc.nextFloat();
        System.out.println(marks);
    }
}
