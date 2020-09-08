// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Create the drawing of a heart, diamond, spade and club using the StdDraw function in Java.
 */
public class CardSymbols
{
  public  static void main(String [] args)
  {
   StdDraw.setXscale(0, 100); // x scale from 0 to 100
   StdDraw.setYscale(0, 100); // y scale from 0 to 100
   
   StdDraw.line(20, 0, 0, 30); // This is for the diamond.
   StdDraw.line(20, 0, 40, 30);
   StdDraw.line(40, 30, 20, 60);
   StdDraw.line(0, 30, 20, 60);
   
   StdDraw.arc(60,30, 10, 0, 90);
   StdDraw.arc(60,30,10,90,-180); // This is for the heart.
   StdDraw.arc(80,30, 10, 0, 90);
   StdDraw.arc(80,30,10,90,-180);
   StdDraw.line(70, 0, 50, 30);
   StdDraw.line(70, 0, 90, 30);
   
   StdDraw.line(0, 75, 20, 100); 
   StdDraw.line(45, 75, 20, 100);
   StdDraw.arc(35, 75, 10, 180, 0); // This is for the spades.
   StdDraw.arc(10, 75, 10, 180, 0);
   StdDraw.line(20, 75, 18, 60);
   StdDraw.line(25, 75, 27, 60);
   StdDraw.line(18, 60, 27, 60);
   
   StdDraw.arc(60,70,10,90,315);
   StdDraw.arc(69.5,85,10,-30,210);
   StdDraw.arc(79, 71.5, 10, 235, 90);
   StdDraw.line(67, 62.5, 66, 55); // This is for the club
   StdDraw.line(73, 62.5, 74, 55);
   StdDraw.line(66, 55, 74, 55);
  
                
  }
}