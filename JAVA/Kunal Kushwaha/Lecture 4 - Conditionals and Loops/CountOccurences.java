import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int n = input.nextInt(); // number to find occuerneces in.
        int countThisNum = input.nextInt(); // number to find in a long number;
        int count = 0;  // counting 
        int rem;
        while(count < n){
            rem = n % 10;
            if(rem == countThisNum){
                count++; // total number of counts will be stored here.
            }
        }
        System.out.println(count);
    }
}
