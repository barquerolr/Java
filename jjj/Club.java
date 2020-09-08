public class Club
{
  public  static void main(String [] args)
  {
   StdDraw.setXscale(0, 100); // x scale from 0 to 100
   StdDraw.setYscale(0, 100); // y scale from 0 to 100
   StdDraw.arc(30,40,3,90,315);
   StdDraw.arc(33,44,3,-30,210);
   StdDraw.arc(36,40,3,235,90);
   StdDraw.line(34,38, 36,33);
   StdDraw.line(32,38,30,33);
   StdDraw.line(30,33,36,33);
   StdDraw.arc(30,70,3,180,-45);
   StdDraw.arc(36,70,3,225,0);
   StdDraw.line(27, 70, 33, 80);
       StdDraw.line(33, 80, 39, 70);
       StdDraw.line(32, 68, 30, 63);
       StdDraw.line(34, 68, 36, 63);
       StdDraw.line(30, 63, 36, 63);
  }
}