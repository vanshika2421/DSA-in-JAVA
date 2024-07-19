//  package Lecture 3;
import java.util.Scanner;

public class ScannerPart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //object ke andar input lena.
//        System.out.println( input.nextInt());
//        System.out.println(input.next());
        System.out.println(input.nextLine());
    }
}

/*

Scanner input = new Scanner(System.in)
Scanner -> library jis se um input le skte hai.
input -> a variable
new -> memory allocating for variable
Scanner -> again library or syntax.
System.in -> kahan se lena hai input (system se)
-------------------------------------------------------
input.nextInt() -> only take integer as input.
input.next() -> take string's first word of line only.
input.nextline() -> takes entire line.

*/

// the standatd input stream. this stream is already open and ready for input data. typically, this input data corresponds to keyboard input stream or other specified by user enviorment.
