import java.util.*;

public class ifElse {
public static void main(String[] args){
        System.out.println("hey there, I am using whatsapp");
        int num = 7;
        if(num == 6){
            System.out.println("yes this number is 6");
        }
        else{
            System.out.println("no this number is not 6");
        }
        int salary = 2400;
        // string gender = "female";
        if(salary > 3000){
            System.out.println("this is a salary of male staff");
            salary += 200;
        }
        else{
            System.out.println("this is a salary of a female staff");
            salary += 500;
        }
        System.out.println(salary);
        System.out.println("salary is incremented");
    }
} 



