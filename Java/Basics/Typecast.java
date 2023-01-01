public class Typecast {
    public static void main(String[] args) {
        //typecasting: narrow conversion 
        int num = (int)(58.91);
        System.out.println("Number: " + num);

        //automatic type promotion to expressions
        int a = 300;
        byte b = (byte)(a);
        System.out.println("Byte value: " + b);
    }
}
