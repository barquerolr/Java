// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Create Hexagram using the StdDraw function in Java.
 */
public class Hexagram
{
  public  static void main(String [] args)
  {
    StdDraw.line(0.0, 0.25, 1.0, 0.25);
    StdDraw.line(1.0, 0.25, 0.5, 1.0);
    StdDraw.line(0.0, 0.25, 0.5, 1.0);
    StdDraw.line(0.0, 0.75, 1.0, 0.75);
    StdDraw.line(1.0, 0.75, 0.5, 0.0);
    StdDraw.line(0.0, 0.75, 0.5, 0.0);
  }
}