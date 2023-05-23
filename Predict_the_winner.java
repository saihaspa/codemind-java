import java.util.*;
import java.lang.*;
public class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0) c+=a[i];
            else s+=a[i];
        }
        if(Math.abs(s-c)%4==0) System.out.println("X");
        else System.out.println("Y");
    }
}