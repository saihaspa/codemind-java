import java.util.Scanner;
public class Rotate
{    
 public static void main(String[] args) 
 {      
     Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int k=sc.nextInt();
        if(t%2==0 &&(t>0 || k%2==0)) System.out.print("YES");
        else System.out.println("NO");
        
    }    
}    