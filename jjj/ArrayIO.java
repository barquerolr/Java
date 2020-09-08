import java.text.DecimalFormat;
public class ArrayIO
{
  public static void main(String args[])
  {
    DecimalFormat twodecimalplaces = new DecimalFormat("0.00");
    double nums[] = new double[6];
    double random = 0;
    for (int  i = 0; i < 6; i=i+1)
      {
        nums[i] = random;
        random = StdRandom.uniform(10, 90);
      }
     StdArrayIO.print(nums);
      System.out.println();
      
      
  }
}