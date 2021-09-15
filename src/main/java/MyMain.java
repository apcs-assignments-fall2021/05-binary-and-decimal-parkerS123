import java.util.Scanner;

public class MyMain {

    // Given a String representing a binary number (e.g. "1010") as input,
    // and returns the decimal value of that number.
    // You can use Integer.parseInt() to convert a String into a **decimal** number.
    // Ex. binaryToDecimal("1010") => 10 (ten)
    //     binaryToDecimal("110010") => 50
    public static int binaryToDecimal(String binary) {
        int binary_decimal = Integer.parseInt(binary);
        int n = 1;
        int final_num = 0;
        while (binary_decimal > 0) {
            int lastdigit = binary_decimal % 10;
            final_num = (lastdigit * n) + final_num;
            binary_decimal /= 10;
            n *= 10;
        }
        System.out.println(final_num);
        return final_num;
    }

    // Given a decimal number (e.g. 152) as input, and returns a String
    // representing the binary representation of that number.
    // Ex. decimalToBinary(7) => "111"
    //     decimalToBinary(152) => "10011000"
    public static int decimalToBinary(int decimal) {
        int m = 1;
        int final_things = 0;
        while (decimal > 0) {
            int holder = decimal % 2;
            final_things = (holder * m) + final_things;
            decimal /= 2;
            m *= 10;
        }
        System.out.println(final_things);
        return final_things;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number in binary: ");
        String binary = scan.nextLine();
        binaryToDecimal(binary);

        System.out.println("Enter a number in decimal: ");
        int decimal = scan.nextInt();
        decimalToBinary(decimal);
    }
}
