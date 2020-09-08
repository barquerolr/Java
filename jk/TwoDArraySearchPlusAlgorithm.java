public class TwoDArraySearchPlusAlgorithm//Example of using for loops to search two-dimensional array
 {
   public static void main(String args[]) 
   {
     
     
     int number=0;//set variable holding incremental element to zero
     int[][] a = {{11,21,33},{36,444,12},{21,34,15}};//array a of size 3 by 3
          System.out.println("The following are even numbers in the array:");
           for (int row=0; row<3; row=row+1)//This for loops controls the row progression
          {
            for (int column=0; column<3; column=column+1)//This for loop controls the column progression
                  {number=a[row][column];//setting array elements to different values of number
                   if (number%2==0)//checking to see if number is even
                     System.out.print(" "+number+", ");//print of even numbers
                              
                   }
              
          }
          System.out.println();
    }    
 }

