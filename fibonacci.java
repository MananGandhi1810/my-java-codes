import java.util.*;
public class fibonacci
{
    public static void main(){
        int  i,a,b,c=0;
        //Scanner s=new Scanner(System.in);
        //System.out.println("enter a no");
        //a=s.nextInt();
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for(i=1;i<=20;i++)
        {
            c=b+a;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}