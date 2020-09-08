public class ArrayPop
 {
   public static void main(String args[]) 
   {
       int number=2;//beginning number for a[0]
      int length = 5;
     double[] a = new double[length];//set array named a to size of 5 elements starting at a[0] and ending at a[4]
     for (int i=0; i<length; i=i+1)//using for loop to populate an array, note i represents subscript of array
     {
      a[i]=number;//first time through number = 2 
        number=number *3;
        System.out.print(a[i]+" ");//out of the array elements
     }
   }    
 }
