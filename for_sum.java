import java.util.*;
public class for_sum{
    public static void main()
    {
    Scanner s=new Scanner(System.in);
    int i,sum=1,a;
    for(i=1;i<=10;i++){
        System.out.print("enter a no.");
        a=s.nextInt();
        sum=a*sum;
    
    }
    System.out.println(sum);
    }
}