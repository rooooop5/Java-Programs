//import java.util.Scanner;
public class Arraytriangle
{
  public static void main(String args[])
  {
    int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    int i,j,sum=0;
    for (i=0;i<3;i++)
    {
      for (j=0;j<3-i;j++)
           sum=sum+arr[i][j];
    }
    System.out.println("The sum of elements in the upper left triangle is"+sum);
    sum=0;
    for(i=0;i<3;i++)
    {
        for(j=0;j<=i;j++)
           sum=sum+arr[i][j];
    }
    System.out.println("The sum of elements in the lower left triangle is"+sum);
    sum=0;
    for(i=0;i<3;i++)
    {
        for(j=i;j<3;j++)
            sum=sum+arr[i][j];
    }
    System.out.println("The sum of elements in the upper right triangle is"+sum);
    sum=0;
    for(i=0;i<3;i++)
    {
        for(j=2;j>=3-i-1;j--)
            sum=sum+arr[i][j];
    }
      System.out.println("The sum of elements in the lower right triangle is"+sum);
  }
}