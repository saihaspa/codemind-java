import java.util.Scanner;
class AreaOfTriangle 
{
	public static void main(String args[]) 
	{
		double a,b,c=0.0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
	    c=a*b;	
		System.out.format("%.2f",c);
	}
}