import java.util.*;
public class factorial{
    public static void main(){
        Scanner s=new Scanner(System.in);
        int no,i,factorial=1;
        System.out.println("enter a no");
        no=s.nextInt();
        for(i=no;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    
    
    
    }






}