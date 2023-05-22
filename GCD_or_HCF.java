import java.util.*;
import java.lang.*;
public class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n,a,b,c,t=0;
		m=sc.nextInt();
		n=sc.nextInt();
		for(int i=1;i<=m;i++)
		{   
		    if(m%i==0 && n%i==0)
		    t=i;
		}
	    System.out.println(t);
	}
}		