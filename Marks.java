import java.util.Scanner;
public class Marks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students.");
        int n=sc.nextInt();
        String name[]=new String[n];
        int totalmarks[]=new int[n];
        System.out.println("Enter name of the student and corresponding totalmarks.");
        for (int i=0;i<n;i++)
        {
            name[i]=sc.next();
            totalmarks[i]=sc.nextInt();
        }
        float avg,dev,sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+totalmarks[i];
        }
        avg=sum/n;
        System.out.println("The average marks of the students are "+avg);
        for (int i=0;i<n;i++)
        {
            dev=totalmarks[i]-avg;
            System.out.println("The deviation of "+name[i]+" to the average is "+dev);
        }
    }
}
