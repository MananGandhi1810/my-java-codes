import java.util.*;
public class triangle
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
       if(a+b>c&&a+c>b&&b+c>a){
       if(a==b&&b==c){
        System.out.println("equilateral triangle");
        }
        else if(a==b&&b!=c||a!=b&&b==c||a==c&&c!=b)
        {
        System.out.println("isosceles triangle");
        }
        else{
        System.out.println("scalene triangle");
        }}
        else{
        System.out.println("not possible");
        }
    }
}