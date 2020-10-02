import java.util.*;
public class posneg
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double no;
       System.out.println("Enter a no");
       no=Math.abs(s.nextDouble());
       if(no>0){
       System.out.println("no is positive");
    }
       if(no<0){
       System.out.println("no is negative");
    }
           if(no==0){
       System.out.println("no is 0");
    }
    }
}