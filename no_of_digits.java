import java.util.*;
public class no_of_digits{
    public static void main(){
        Scanner s=new Scanner(System.in);
        int u,original,a,d;
        System.out.println("enter a no");
        a=s.nextInt();
        u=0;
        original=a;
        d=0;
        while(a!=0){
            u=a%10;
            d++;
            a=a/10;
        }
        if(d==0){
        System.out.println("1 digit no");
        }
        else{
        System.out.println(d+"no of digits");
    }
}
}