import java.util.Scanner;
public class Adam_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a,b,c=0;
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            System.out.println(c);
            t--;
        }
    
    }
}