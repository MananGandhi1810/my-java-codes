import java.util.*;
public class velocity
{ 
    public static void main()
    {
       Scanner d=new Scanner(System.in);
       double v,u,a,s;
       System.out.println("Enter initial velocity");
       u=d.nextDouble();
       System.out.println("Enter acceleration");
       a=d.nextDouble();
       System.out.println("Enter displacement");
       s=d.nextDouble();
       v=Math.sqrt(Math.pow(u,2)+2*a*s);
       System.out.println("final velocity= "+v);
    }
}