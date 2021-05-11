import java.util.Scanner;
public class nextprime
{
    static int prime(int a)
    {
        int c=0;
        for (int i=1;i<=a;i++)
        {
            if (a%i==0)
                c++;
        }
        if (c==2)
            return 1;
        else
            return 0;
    }
    static void primecheck(int b)
    {
        if (prime(b)==1)
            System.out.println("is prime");
        else
        {
            while (true)
            {
                b = b + 1;
                if (prime(b) == 1) break;
            }
            System.out.println("next prime is "+b);
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primecheck(n);
    }
}
