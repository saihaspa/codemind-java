import java.util.*;
import java.lang.*;
public class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,r=0,k=0;
		n=sc.nextInt();
		while(n>0)
		{
		    rem=n%10;
		    if(rem>k)
		    {
		        k=rem;
		    }
		    n/=10;
		}
	    System.out.println(k);
	}
}		