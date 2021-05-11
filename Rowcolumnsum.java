import java.util.*;
public class Rowcolumnsum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns.");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println();
        int arr[][]= new int[m][n];
        System.out.println("Enter the elements of the array.");
        for (int i=0;i<m;i++)//loop for taking input elements of array.
        {
            for (int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
        int sum = 0;
        //loop for row sum
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
            {
                sum = sum + arr[i][j];
            }
            System.out.println("The sum of elements of row "+i+" is "+ sum);
            sum=0;
        }
        //loop for column sum
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                sum = sum + arr[j][i];
            }
            System.out.println("The sum of elements of column " +i+" is "+sum);
            sum=0;
        }
    }
}
