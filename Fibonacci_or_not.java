import java.util.*;
import java.lang.*;
public class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,a,b,c,t=0;
		n=sc.nextInt();
		a=0;
		b=1;
		if(n==0 || n==1){
		    System.out.print("True");
		    t+=1;
		}
		for(int i=2;i<n;i++)
		{   
		    c=a+b;
		    if(c==n)
		    {
		        System.out.println("True");
		        t+=1;
		        break;
		    }
		    a=b;
		    b=c;
		}
		if(t==0)
		    System.out.println("False");
	}
}		