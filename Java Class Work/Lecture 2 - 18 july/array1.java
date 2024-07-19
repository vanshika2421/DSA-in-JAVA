import java.util.Scanner;

public class array1 {
    public static void main(String[] args){

        int[] marks = new int[5];
        // System.out.println("start writing an array");
        for(int i = 0; i < marks.length; i++){
            Scanner sc = new Scanner(System.in);
            marks[i] = sc.nextInt();
        }
        // System.out.println("array is : ");
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }        
    }

}
