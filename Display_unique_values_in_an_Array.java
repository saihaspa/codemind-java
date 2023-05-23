import java.util.*;
public class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,k=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int e:a)
        {
            int c=0;
            for(int f:a)
            {
                if(e==f)
                {
                    c++;
                }
            }
            if(c==1)
            {
                k=1;
                System.out.print(e+" ");
            }
        }
        if(k==0) System.out.println("-1");
    }
}