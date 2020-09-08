import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        //System.out.println("Hello, World");
        //System.out.print("Hello World.");
        System.out.println();
        int foo = 0;
        int mult = 0;
        int answer = 0;
        System.out.println("Enter number: ");
        foo = number.nextInt();
        System.out.println("Enter number to multiply original number by: ");
        mult = number.nextInt();
        answer = foo * mult;
        System.out.println("Your number " +foo + " multiplied by " +mult + " is: " +answer);
        
        
    }
}