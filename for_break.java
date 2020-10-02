import java.util.*;
public class for_break
{
    public static void main(){
        int  i,a;
        //Scanner s=new Scanner(System.in);
        //System.out.println("enter a no");
        //a=s.nextInt();
        for(i=1;i<=100;i++)
        {
            if(i%10==0){
            continue;
            }
            System.out.println(i);
        }
    }
}