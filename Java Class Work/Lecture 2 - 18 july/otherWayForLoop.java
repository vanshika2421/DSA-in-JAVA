import java.util.Scanner;


public class otherWayForLoop {
    public static void main(String[] args) {
        float[] arr = new float[5];
        Scanner sc = new Scanner(System.in);
        for (float[] ele : arr) {
            for (float i : ele) {
                arr[i] = sc.nextFloat();
                System.out.print(arr[i] + " ");
            }
        }
    }
}

