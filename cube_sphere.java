import java.util.*;
public class cube_sphere
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double b;
       String a;
       System.out.println("Enter cube or sphere and i will give you its volume");
       a=s.next();
       switch(a)
       {
        case"cube":
        System.out.println("enter side");
        b=s.nextDouble();
        System.out.println(Math.pow(b,3));
        break;
        case"sphere":
        System.out.println("enter radius");
        b=s.nextDouble();
        System.out.println(4.0/3.0*22.0/7.0*Math.pow(b,3));
        break;
        
        default:System.out.println("wrong input");
        
        }
    }
}