import java.util.*;
public class scanner
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double r,pi=22.0/7.0,r2,area;
       System.out.println("Enter Radius");
       r=s.nextDouble();
       r2=Math.pow(r,2);
       area=pi*r2;
       System.out.println("since radius =pi*r*r,"+pi+"*"+r2+"="+area);
    }
}