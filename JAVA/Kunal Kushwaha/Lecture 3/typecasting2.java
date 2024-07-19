public class typecasting2 {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.56f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println(result);
        System.out.println((f*b) + " " + (i/c) + " " + (d-s));

        /*
        (f*b) -> float
         (i/c) -> chararter
         (d-s) -> double.
        */
    }
}
