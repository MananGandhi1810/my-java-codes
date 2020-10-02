import java.util.*;
public class switch_case
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double b,c;
       char a;
       System.out.println("Enter a no.");
       b=s.nextDouble();
       System.out.println("Enter a no.");
       c=s.next().charAt(0);
       System.out.println("Enter c or s");
       a=s.next().charAt(0);
       switch(a)
       {
        case'c':
        if(b+c==90){
        System.out.println("complementary angle");
        break;
        }
        else{
        System.out.println("not a complementary angle");
        break;
        }
        case's':
        if(b+c==180){
        System.out.println("supplementary angle");
        break;
        }
        else{
        System.out.println("not a supplementary angle");
        break;
        }
        default:System.out.println("wrong input");
        
        }
    }
}