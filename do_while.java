import java.util.*;
public class do_while{
    public static void main(){
        Scanner s=new Scanner(System.in);
        int u,original,a,b=0;
        System.out.println("enter a no");
        a=s.nextInt();
        u=0;
        original=a;
        int sq=a*a;
        do{
            u=sq%10;
            b=u+b;
            sq=sq/10;
        }while(sq!=0);
        if(b==original){
        System.out.println("neon no");
        }
        else{
        System.out.println("not a neon no");
        }
    }
}