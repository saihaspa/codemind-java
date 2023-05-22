import java.util.*;
import java.lang.*;
public class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n,k,t=0;
		n=sc.nextInt();
		for(int i=1;i<=Math.sqrt(n)+1;i++)
		{
		    if(i*i==n)
		    {
		        System.out.println("True");
		        t+=1;
		        break;
		    }
		}
		if(t==0)
	    System.out.println("False");
	}
}		