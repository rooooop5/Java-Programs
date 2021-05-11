import java.util.Scanner;
public class Bubblesort
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,str;
        int arr[]= new int[20];
        for (i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        for (int y=0;y<n;y++)
        {
            for (i = 0; i < n; i++)
            {

                j = i + 1;
                if (j < n)
                {
                    if (arr[j] < arr[i])
                    {
                        str = arr[i];
                        arr[i] = arr[j];
                        arr[j] = str;
                    }
                }
            }
        }
        for (i=0;i<n;i++)
            System.out.print(arr[i]+"  ");
    }
}
