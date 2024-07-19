import java.util.*;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        if(marks >= 70) {
            System.out.println("division is first");
        }
        else if(marks >= 50){
            System.out.println("division is second");
        }
        else if(marks >= 30){
            System.out.println("division is third");
        }
        else if(marks < 30){
            System.out.println("division is fail");
        }
    }
}
