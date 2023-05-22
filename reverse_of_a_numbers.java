import java.util.*;
import java.lang.*;
public class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,rem,r=0;
		n=sc.nextInt();
		while(n>0)
		{
		    rem=n%10;
		    r=r*10+rem;
		    n/=10;
		}
	    System.out.println(r);
	}
}		