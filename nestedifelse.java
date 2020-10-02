import java.util.*;
public class nestedifelse
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double a,b,c,d,e;
       System.out.println("Enter first no");
       a=s.nextDouble();
       System.out.println("Enter second  no");
       b=s.nextDouble();
       System.out.println("Enter third no");
       c=s.nextDouble();
       if(a>b){
       if(a>c){
       System.out.println(a);
       }
       else{
        System.out.println(c);      
       }
       
       }
       else{
       if(b>c){
       System.out.println(b);
       }
       else{
        System.out.println(c);      
       }
       
       }
    }
}