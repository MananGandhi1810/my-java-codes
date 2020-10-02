import java.util.*;
public class split{
    public static void main(){
        Scanner s=new Scanner(System.in);
        int u,original,a,reverse;
        System.out.println("enter a no");
        a=s.nextInt();
        u=0;
        original=a;
        reverse=0;
        while(a!=0){
            u=a%10;
            System.out.println(u);
            a=a/10;
        }
        
    }
}