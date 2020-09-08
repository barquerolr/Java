public class Diamond
{
  public  static void main(String [] args)
  {
    StdDraw.line(0.5, 1.0, 0.0, 0.5);
    StdDraw.line(0.0, 0.5, 0.5, 0.0);
    StdDraw.line(0.5, 1.0, 1.0, 0.5);
    StdDraw.line(1.0, 0.5, 0.5, 0.0);
    double [] xd = {0.0, 0.5, 1.0, 0.5};
    double [] yd = {0.5, 0.0, 0.5, 1.0};
    StdDraw.filledPolygon(xd, yd);
  }
}