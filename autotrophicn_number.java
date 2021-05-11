import java.util.Scanner;
public class autotrophicn_number
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int str=n,digit=0,rem,str1=0;
        for(int i=1;str>0;i++)
        {
            str=str/10;
            digit++;
        }
        int square=n*n;
        for (int i=1;i<=digit;i++)
        {
            rem=square%10;
            str=str*10+rem;
            square=square/10;
        }
        for (int i=1;i<=digit;i++)
        {
            rem=str%10;
            str1=str1*10+rem;
            str=str/10;
        }
        System.out.println(str1);
        if (str1==n)
            System.out.println("it is a autotrophic number");

    }
}
