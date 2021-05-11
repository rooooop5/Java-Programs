import java.util.*;
public class Selectionsort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j,min,str;
        int arr[] = new int[20];
        for (i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (i=0;i<n;i++)
        {
            min=i;
            for (j=i;j<n;j++)
            {
                if (arr[j]<arr[i])
                    min=j;
            }
            str=arr[i];
            arr[i]=arr[min];
            arr[min]=str;
        }
        for (i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
    }

}