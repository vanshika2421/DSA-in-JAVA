import java.util.Scanner;

public class fibbonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        int secondNumber = in.nextInt();
        int fibboNumber = in.nextInt();
        
        for(int i = 1 ; i < fibboNumber; i++){
           int x = secondNumber;
           secondNumber += firstNumber;
            firstNumber = x;
        }
        System.out.println(secondNumber);
    }
}
