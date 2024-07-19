import java.util.Scanner;


public class floatInput {
    public static void main(String[] args) {
        float[] numberic = new float[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            numberic[i] = sc.nextFloat();
            System.out.print(numberic[i] + " ");
        }    }
}

