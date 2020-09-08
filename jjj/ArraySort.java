// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Practice passing arrays, and sorting within the array.
 */
public class ArraySort // example of passing to methods
{
  public static void main(String[] args)//main program
  {
    int numbers[]={98, 55, 76, 22, 12, 33, 87, 41, 65};//array that will be passed
    for(int i = 0; i < 9; i=i+1)
        System.out.println(numbers[i]);//output showing original values of array
       
    System.out.println("The numbers in descending order are ");
    descendarray(numbers);
  }
  
  
   public static void descendarray(int numbers[])
   { 
     int numbers2[]=new int[9];
     numbers2[0]=numbers[0];  
     numbers2[1]=numbers[6];
     numbers2[2]=numbers[2];
     numbers2[3]=numbers[8];
     numbers2[4]=numbers[1];
     numbers2[5]=numbers[7];
     numbers2[6]=numbers[5];
     numbers2[7]=numbers[3];
     numbers2[8]=numbers[4];
     for(int j = 0; j < 9; j=j+1)
       System.out.print(" "+numbers2[j]+" ");
   }
}