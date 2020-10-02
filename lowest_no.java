import java.util.*;
public class lowest_no
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double a,b,c,d,e;
       System.out.println("Enter first no");
       a=s.nextDouble();
       System.out.println("Enter second  no");
       b=s.nextDouble();
       System.out.println("Enter third no");
       c=s.nextDouble();
       d=(a>b)?a:b;
       e=(d>c)?d:c;
       System.out.println("greatest no is "+e);
       d=(a<b)?a:b;
       e=(d<c)?d:c;
       System.out.println("lowest no is "+e);
    }
}