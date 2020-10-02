
import java.util.*;
public class prime
{
    public static void main(){
    Scanner s=new Scanner(System.in);
    long i,a;
    System.out.println("enter a no");
    a=s.nextLong();
    for(i=a-1;i>1;i--){
        if (a%i!=0){
            continue;
        }
        else{
            System.out.println("no is composite");
            break;
        }
        
    }
    if (i==1)
    {
            System.out.println("no is prime");
        }
    }
}