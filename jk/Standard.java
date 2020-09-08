public static Standard
{
  public static double max(double [] numbers);
  {
    double numbers[] = new double[10];
    double max = Double.NEGATIVE_INFINITY;
    for (int i = 0; i < 10; i=i+1)
      if (numbers[i] > max)    max = numbers[i];
    return max;
  }
}