import java.util.*;
public class greatest_10{
    public static void main()
    {
    Scanner s=new Scanner(System.in);
    int i,c,a=0,b,d;
    System.out.print("enter a no.");
    a=s.nextInt();
    b=a;
    c=a;
    d=a;
    for(i=1;i<=9;i++){
        System.out.print("enter a no.");
        b=s.nextInt();
        c=b;
        if(a<b){
            a=b;
        }
        else{
            a=a;
        }
        if(d>c){
            d=c;
        }
        else{
            d=d;
        }
    }
    System.out.println(a+" is the greatest");
    System.out.println(d+" is the smallest");
    }
}