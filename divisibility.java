import java.util.*;
public class divisibility
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double a;
       System.out.println("Enter a number");
       a=s.nextDouble();
       if(a%3==0){
           System.out.println(a+"is divisible by 3");
        }
        else{
        System.out.println(a+"is not divisible by 3");
        }
        if(a%5==0){
           System.out.println(a+"is divisible by 5");
        }
         else{
        System.out.println(a+"is not divisible by 5");
        }
    }
}