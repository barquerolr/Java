import java.util.Scanner;//This line is needed to use the scanner 
public class Page89Top
 {
   public static void main(String args[]) 
   {
     Scanner stuff = new Scanner(System.in);//stuff is name of what's coming in from command line
     int n=0;
     System.out.println("Put entry from scanner");
     n = stuff.nextInt();//entry from scanner
     
     double[]a=new double[n];//array set to size of entry from scanner
     
     for (int i=0;i<n;i++)//populate array a subscript 0 through n-1
     {
         a[i]=Math.random();//generate random double between 0 and 1
         System.out.println(a[i]);// output of array values
     }
    }    
 }
