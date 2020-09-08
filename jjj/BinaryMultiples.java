import java.util.Scanner;
public class BinaryMultiples
{
  public static void main(String args[])
  {
    Scanner binary = new Scanner(System.in);
    int number = 0;
    System.out.println("Enter a number to check if it's a binary multiple");
    number = binary.nextInt();
    int number1=number;
    int check = checking(number, number1);
    if (check==1)
        System.out.println("Binary M");
        if (check==0)
            System.out.println("Not Binary M");
  }
  
  public static int checking(int num, int num1)
  {
    if (num1 % 2 == 0)
   return 1;
    if(num1%2==1)
      return 0;  
    else  
        return checking(num, num1-1);
  
  }
}