import java.sql.SQLOutput;
import java.util.Scanner;

public class array2{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int[][] arrayd = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++) {

                arrayd[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++) {
                System.out.print(arrayd[i][j]);
//                System.out.println();
            }
        }
    }
}

 