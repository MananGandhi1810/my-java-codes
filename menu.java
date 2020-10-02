import java.util.*;
public class menu
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       char a;
       System.out.println("Enter f, s or t");
       a=s.next().charAt(0);
       switch(a)
       {
        case'f':System.out.println("first floor");
        break;
        case's':System.out.println("second floor");
        break;
        case't':System.out.println("third floor");
        break;
        default:System.out.println("wrong input");
        break;
        
        }
    }
}