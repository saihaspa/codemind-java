import java.util.*;
import java.lang.*;
public class Sample
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,a,b,c;
		n=sc.nextInt();
		a=0;
		b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=2;i<n;i++)
		{   
		    c=a+b;
		    System.out.print(c+" ");
		    a=b;
		    b=c;
		    
		}
	}
}		