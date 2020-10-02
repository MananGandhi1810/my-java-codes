import java.util.*;
public class dst
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double d,speed,t;
       System.out.println("Enter distance");
       d=s.nextDouble();
       System.out.println("Enter time");
       t=s.nextDouble();
       speed=d/t;
       System.out.println("speed="+speed);
    }
}