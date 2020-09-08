import java.util.Scanner;//this line is needed for the scanner
public class BaseExponent22
{
  public static void main(String[] args)
  { 
  Scanner stuff = new Scanner(System.in);
  System.out.println("Pleas enter a number");
  int base = stuff.nextInt();
  System.out.println("Pleas enter an exponent");
  int exponent = stuff.nextInt();
  int power = power(base,exponent);//method call of the sum
  System.out.println(base+" to the "+exponent+" power is "+power);//outputs the recursive sum of number the user inputed
  }
  
   public static int power(int base, int exponent)//method to find the recursive sum of the number
  {
     if(power<=1)
       return 1;
     else               
       return base*power(base,exponent-1);
   }
}
