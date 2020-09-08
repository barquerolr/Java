// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Show the sum, average, maximum and minimum of the 6x6 table previously created.
 */
public class RandomNumberArray2
 {
    public static void main(String args[]) 
   {
   int count =1;
   double sum = 0;
   int max = 0;
   int min = 0;
   double average = 0;
     int[][] a = new int[4][6];
          for (int row=0; row<4; row=row+1)
          {
            for (int column=0; column<6; column=column+1)
            {
              a[row][column]=count;
              System.out.print(a[row][column] + " " );
              count=(int)(Math.random()*100);
           } 
            System.out.println( "" );
          }
          for(int row=0; row < 4; row=row+1)
          {
            for(int column=0; column < 6; column=column+1)
            {
              count=a[row][column];
              if (count > max)
              max = count;  
              if (count  <min)
              min = count;
              sum = sum + a[row][column];
              System.out.println("The sum is: "+sum);
              average = sum / 24;
              System.out.println("The average is: "+average);
            }
          }
          System.out.println(" The maximum is: "+max);
          System.out.println(" The minimum is: "+min);
    }
}