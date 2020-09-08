public class TwoDArraySearch//Example of using for loops to search two-dimensional array
 {
   public static void main(String args[]) 
   {
     
     int originalnum=0;//set variable holding largest value to zero
     int number=0;//set variable holding incremental element to zero
     int[][] a = {{11,21,33},{36,444,12},{21,34,15}};//array a of size 3 by 3
          for (int row=0; row<3; row=row+1)//This for loops controls the row progression
          {
            for (int column=0; column<3; column=column+1)//This for loop controls the column progression
                  {number=a[row][column];//setting array elements to different values of number
                   if (number>originalnum)//checking to see if new element is larger
                     originalnum=number;//if larger set originalnum to new value
                              
                   }
              
          }
          System.out.println("The largest number in the array is:  "+originalnum);//output to screen, make sure occurs outside of both for loops
    }    
 }




