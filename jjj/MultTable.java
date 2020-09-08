public class MultTable
{
  public static void main(String args[])
  {
    int multiply = 0;
    int [] a = 
    {1, 3, 5, 7, 9, 11
    };
    for (int row = 0; row < 12; row=row+1)
      if (row % 2 == 1)        System.out.print(" "+  row + "");
    int [] b = 
    {2, 4, 6, 8, 10, 12
    };
    int [][] d = ;
    {
      2, 6, 10, 14, 18, 22
      multiply = a[0]*b[0];
    for (int column = 0; column < 12; column=column+1)
      if (column % 2 == 0)     System.out.println(column + "" + multiply);
    System.out.println(multiply);
    int [][] c = new int[6][6];
    for (int i = 0; i < 6; i=i+1)
    {
      for (int j = 0; j < 6; j=j+1)
      {
        c[i][j]+= a[i] * b[j];
      }
    }
  }
}