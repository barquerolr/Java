import java.util.Scanner;//This line is needed to use the scanner 
 public class SentinelMine
 {
   public static void main(String args[]) 
   {
     Scanner stuff = new Scanner(System.in);//stuff is name of what's coming in from command line
     int first=0;
     while (first!=-1)//-1 is sentinel value
     {
      System.out.println("Put entry from scanner...-1 to stop!");
     first = stuff.nextInt();
     System.out.println(first);//show entry for variable first
     }
     System.out.println("Last entry was -1 so I am stopping");
   }    
 }
