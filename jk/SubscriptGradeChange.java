public class SubscriptGradeChange
{
  public static void main(String[] args)
  {
    int array[]={93,61,72,45,84,51,70,83,96,66};//array that will be passed
    System.out.println("the values in the original array are");
    for(int i=0; i<array.length; i++)
      System.out.println(array[i]);//outputs the original array
    System.out.println("the values of a[3] before modifyElement is  "+array[3]);//value of subscript 3
        modifyElement(array[0,1,2,3,4,5,6,7,8,9]);//call to method to modify a single subscript
        System.out.println("the values of a[3] after modifyElement is  "+array[3]);   //value of subscript 3 after method