public class TwoDArrayPop2//Example of using for loops to populate two-dimensional array
 {
   public static void main(String args[]) 
   {
     int number=1;//initial value for number...should show up as value for a[0][0]
     int[][] a = new int[4][6];//array a of size 3 by 3
          for (int row=0; row<4; row=row+1)//This for loops controls the row progression
          
          {
            for (int column=0; column<6; column=column+1)//This for loop controls the column progression
                  {a[row][column]=number;//setting array elements to different values of number
                   System.out.print(a[row][column]+ " " );
                   number=(int)(Math.random()*100);//changing of values for number;//changing of values for number
                   }
            System.out.println( "" );
              
          }
    }    
 }






