import java.util.Scanner;

public class elementPresentOrnot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("write a number to find: ");
        int num = sc.nextInt();
        boolean found = true;
        int[] numbers = {1,2,3,4,5};
        for(int i = 0; i < numbers.length; i++ ){
            if (numbers[i] == num) {
                found = true; // Set found to true if number is found
                break; // Exit the loop since we found the number
            }
        }
        if(found){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
}
