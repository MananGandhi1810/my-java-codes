import java.util.*;
public class swap
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double a,b;
       System.out.println("Enter a");
       a=s.nextDouble();
       System.out.println("Enter b");
       b=s.nextDouble();
       System.out.println("value before swap="+a+" "+b);
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("new value="+a+" "+b);
    }
}