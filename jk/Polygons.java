import java.util.Scanner;
public class Polygons
{
  public static void main(String args[])
  {
    Scanner shapes = new Scanner(System.in);
    int sides=3;
    System.out.println("Place number of sides");
    sides = shapes.nextInt();
    switch(sides)
    {
      case 3: System.out.println("The polygon with 3 sides is: the triangle"); break;
      case 4: System.out.println("The polygon with 4 sides is: the square"); break;
      case 5: System.out.println("The polygon with 5 sides is: the pentagon"); break;
      case 6: System.out.println("The polygon with 6 sides is: the hexagon"); break;
      case 7: System.out.println("The polygon with 7 sides is: the heptagon"); break;
      case 8: System.out.println("The polygon with 8 sides is: the ocatagon"); break;
      case 9: System.out.println("The polygon with 9 sides is: the nonagon"); break;
      case 10: System.out.println("The polygon with 10 sides is: the decagon"); break;
      case 11: System.out.println("The polygon with 11 sides is: the hendecagon"); break;
      case 12: System.out.println("The polygon with 12 sides is: the dodecagon"); break;
      default: System.out.println("Invalid Entry"); break;
    }
  }
}