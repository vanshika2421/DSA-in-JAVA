import java.util.Scanner;

public class franhiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tempretureC = sc.nextFloat();
        float tempF = (tempretureC * (9/5) + 32);
        System.out.println(tempF);
    }
}
