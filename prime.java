//import java.util.*;
public class prime
{
    public static void main (String args[])
    {
        //Scanner sc = new Scanner(System.in);
        int ctr;
        float arr[]= {45,5,71,19,67};
        for (int i=0;i<=4;i++)
        {
            ctr=0;
            for (int j=1;j<=arr[i];j++)
            {
                if (arr[i]%j==0)
                    ctr++;
            }
            if (ctr==2)
                System.out.println(arr[i]+" is a prime number.");
        }
        for (int i=0;i<5;i++)
        {
            arr[i]=(5*(arr[i]-32))/9;
            System.out.println(arr[i]+" ");
        }

    }

}
