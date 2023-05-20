import java.util.*;
public class occurence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        char ch;
        s=sc.nextLine();
        ch=sc.nextLine().charAt(0);
        
        int i=0,c=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch) c++;
        }
        if(c!=0) System.out.println(c);
        else System.out.println("-1");
    }
}