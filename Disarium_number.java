import java.util.*;
import java.lang.*;
public class disarium
{
    public static void main(String args[])
    {
        int n,c=0,len,k,rem;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String s=Integer.toString(n);
        len=s.length();
        k=n;
        while(k>0)
        {
            rem=k%10;
            c+=(int)Math.pow(rem,len);
            len--;
            k/=10;
            
        }
        if(c==n)
            System.out.println("True");
        else
            System.out.println("False");
        
    }
}
