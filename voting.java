import java.util.*;
public class voting
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double age;
       System.out.println("Enter your age");
       age=Math.abs(s.nextDouble());
       if(age>=18){
       System.out.println("You can vote");
       System.out.println("go ahead");
    }
       if(age<18){
       System.out.println("You cannot vote");
       System.out.println("Stop");
    }
    }
}