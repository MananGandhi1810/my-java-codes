import java.util.*;
public class radius
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double r,pi=22.0/7.0,r2,area;
       System.out.println("Enter area");
       area=s.nextDouble();
       r=Math.sqrt(area/pi);
       System.out.println("radius= "+r);
    }
}