import java.util.*;
public class armstrong_number{
    public static void main(){
        Scanner s=new Scanner(System.in);
        int u,original,a,cube,sum=0;
        System.out.println("enter a no");
        a=s.nextInt();
        u=0;
        original=a;
        cube=0;
        while(a!=0){
            u=a%10;
            cube=u*u*u;
            sum=sum+cube;
            a=a/10;
        }
        if(sum==original){
        System.out.println("armstrong no");
        }
        else{
        System.out.println("not an armstrong no");
        }
    }
}