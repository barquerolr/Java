// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Give the cicumference of a circle, cost of the metal, and the total cost of the metal.
 */
import java.util.Scanner;
public class Metal
{
  public static void main(String[] args)
  {
    Scanner steel = new Scanner(System.in);
    double first=0.0; //This is Pi in the equation.
    double second=0.0; // This is d/2 or the radius.
    double third=0.0; // This is the cost of the metal. 
    double answer1=0.0; //This is the answer to the equation C= (Pi * 2r), where c is the circumferecnce, r is the radius.
    double answer2=0.0; // This is the answer to the C=(Pi*2r)*Cost of metal.
    System.out.println("Place the the value for Pi, 3.14");
    first=steel.nextDouble();
    System.out.println("Place the radius of the metal in inches");
    second=steel.nextDouble();
    System.out.println("Place the value for the cost of the metal per feet");
    third=steel.nextDouble();
    answer1=first*(second * 2);
    answer2=answer1*third;
    System.out.println("This is the circumference of the circle: "+answer1);
    System.out.println("This is the cost of the metal per feet in dollars: "+answer2);
   
  }
}
    
     
