// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Create a Nested Square drawing using StdDraw function in Java.
 */
public class NestedSquares
{
  public  static void main(String [] args)
  {
    StdDraw.line(0.5, 1.0, 0.0, 0.5);
    StdDraw.line(0.0, 0.5, 0.5, 0.0);
    StdDraw.line(0.5, 1.0, 1.0, 0.5);
    StdDraw.line(1.0, 0.5, 0.5, 0.0);
    StdDraw.line(0.25, 0.25, 0.25, 0.75);
    StdDraw.line(0.25, 0.75, 0.75, 0.75);
    StdDraw.line(0.75, 0.75, 0.75, 0.25);
    StdDraw.line(0.25, 0.25, 0.75, 0.25);
    StdDraw.line(0.5, 0.75, 0.25, 0.5);
    StdDraw.line(0.25, 0.5, 0.5, 0.25);
    StdDraw.line(0.5, 0.75, 0.75, 0.5);
    StdDraw.line(0.75, 0.5, 0.5, 0.25);
  }
}
    