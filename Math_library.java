import java.util.*;
public class Math_library
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double no;
       System.out.println("Enter a no");
       no=Math.abs(s.nextDouble());
       System.out.println("absolute value= "+no);
       System.out.println("square= "+Math.pow(no,2));
       System.out.println("square root= "+Math.sqrt(no));
       System.out.println("cube= "+Math.pow(no,3));
       System.out.println("cube root= "+Math.cbrt(no));
    }
}