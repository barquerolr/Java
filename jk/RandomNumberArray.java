// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Create a 6 by 6 2-Dimensional Array populated with random numbers between 1 and 100.
 */
public class RandomNumberArray
 {
    public static void main(String args[]) 
   {
     int count =1;
     int[][] a = new int[4][6];
          for (int row=0; row<4; row=row+1)
          
          {
            for (int column=0; column<6; column=column+1)
                  {
                   a[row][column]=count;
                   System.out.print(a[row][column]+ " " );
                   count=(int)(Math.random()*100);
                   }
            System.out.println( "" );
              
          }
    }    
 }
