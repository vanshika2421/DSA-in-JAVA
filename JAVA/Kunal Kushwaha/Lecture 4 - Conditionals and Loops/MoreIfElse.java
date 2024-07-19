import java.util.Scanner;

public class MoreIfElse {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if(month <= 4){
            System.out.println("You Can Apply");
        }
       else if(month < 7 && month >= 5 ){
            System.out.println("you Already applied, please visit our office");
        }
        else {
            System.out.println("Applications are closed. Pleasen try next year");
        }
    }
}
