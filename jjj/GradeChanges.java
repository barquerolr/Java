// Programmed by: Luis Barquero
/* The purpose of this program is to:
 * Practice passing arrays, and perform operations.
 */
public class GradeChanges 
{
  public static void main(String[] args)//main program
  {
    int grades[]={93, 61, 72, 45, 84, 51, 70, 83, 96, 66};//array that will be passed
     for(int k = 0; k < 9; k=k+1)
      System.out.print(" "+grades[k]+" ");
     System.out.println();
    
     System.out.print("The new grades are  ");
     for(int i = 0; i < 9; i=i+1)
       if (grades[i] >= 70 )            gradechanges(grades[i]);
     
     
  }
  
    public static int gradechanges(int grade)  //method to add 10 points to any grade greater than or equal to 70.
  {
    grade=grade+10;
    System.out.print(" "+grade+ " ");
    return grade;
  }//end of element modification method
}