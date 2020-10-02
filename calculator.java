import java.util.*;
public class calculator{
    public static void main(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter first no");
        int a=s.nextInt();
        System.out.println("enter second no");
        int b=s.nextInt();
        int c=a+b;
        System.out.println("sum of "+a+" and "+b+" is: "+c);
    }
}

