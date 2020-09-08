// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Calculate the gross pay using multiple methods.
 */
import java.text.DecimalFormat;
public class StandardStats
{
  public static void main(String argss[])
  {
    DecimalFormat twodecimalplaces = new DecimalFormat("0.00");
    double numbers[] = new double[10];
    double random = 0;
    double max = 0;
    double min = 0;
    double sum = 0;
    double average = 0;
      for (int  i = 0; i < 10; i=i+1)
      {
        numbers[i] = random;
      random = StdRandom.uniform(20, 50);
      System.out.print("  "+twodecimalplaces.format(random)+ "  ");
      }
      System.out.println();
      
      
      max = Double.NEGATIVE_INFINITY;
        for (int j = 0; j < 10; j=j+1) 
        {
          if (numbers[j] > max) max = numbers[j];
        }
            System.out.println("The maximum is: "+twodecimalplaces.format(max));
            
            
      min = Double.POSITIVE_INFINITY;
        for (int k = 0; k < 10; k=k+1) 
        {
          if (numbers[k] < min) min = numbers[k];
        }
           System.out.println("The minimum is: "+twodecimalplaces.format(min));
           
           
           for(int a = 0; a < 10; a=a+1)
           {
             sum+=numbers[a];
           }
           System.out.println("The sum is: "+twodecimalplaces.format(sum));
           
           average = sum/10;
           System.out.println("The average is: "+twodecimalplaces.format(average));
  }
}
     