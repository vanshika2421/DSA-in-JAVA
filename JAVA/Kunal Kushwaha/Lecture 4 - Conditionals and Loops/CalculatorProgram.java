
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // we will take input until we get X or x;
        while(true){
            // take operator as input;
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '*' || op == '-' || op == '/' || op == '%'){
                System.out.println("give first number : ");
                int num1 = sc.nextInt();
                System.out.println("give second number : ");
                int num2 = sc.nextInt();
                if(op == '+'){
                    System.out.println(num1 + num2);
                }
                else if(op == '-'){
                    System.out.println(num1 - num2);
                }
                else if(op == '*'){
                    System.out.println(num1 * num2);
                }
                else if(op == '/'){
                    System.out.println(num1 / num2);
                }
                else if(op == '%'){
                    System.out.println(num1 % num2);
                }
            }
        }
    }

}
