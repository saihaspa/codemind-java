import java.util.*;
public class abundant
{
    public static void main(String args[])
    {
        int n,s=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0) s+=i;
        }
        if(s>n) System.out.println("True");
        else System.out.println("False");
    }
}