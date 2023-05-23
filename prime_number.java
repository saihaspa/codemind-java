import java.util.Scanner;
import java.lang.*;
public class Rotate
{    
 public static void main(String[] args) 
 {      
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=0;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                k=1;
                System.out.println("not a prime");
                break;
            }
        }
        if(k==0)
         System.out.print("prime");
        
    }    
}    