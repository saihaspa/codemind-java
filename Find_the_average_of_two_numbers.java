import java.util.Scanner;
class AreaOfTriangle 
{
	public static void main(String args[]) 
	{
		double a,b,c=0.0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
	    c=(a+b)/2;	
		System.out.format("%.4f",c);
	}
}