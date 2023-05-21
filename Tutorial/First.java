import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        // checks whether given input in int or not
        boolean b = sc.hasNextInt();
        int num1 = sc.nextInt();
        System.out.println(b);
        System.out.println("Enter Number 2 : ");
        int num2 = sc.nextInt();
        System.out.print("Addition is : " + (num1 + num2));
        /*
        nextLine(): Reads a line of text input as a String.
        nextInt(): Reads the next token of input as an int.
        nextDouble(): Reads the next token of input as a double.
        nextBoolean(): Reads the next token of input as a boolean.
        nextByte(): Reads the next token of input as a byte.
        nextShort(): Reads the next token of input as a short.
        nextLong(): Reads the next token of input as a long.
        */
    }
}
//