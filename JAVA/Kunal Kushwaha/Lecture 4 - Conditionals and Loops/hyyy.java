import java.util.Scanner;

public class hyyy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int rem;
        while(n != 0){
            rem = n % 10;
            ans += rem;
        }
        System.out.println(ans);
    }
}
