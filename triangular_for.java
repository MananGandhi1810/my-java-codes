import java.util.*;
public class triangular_for
{
    public static void main(){
        int  i,j;
        //Scanner s=new Scanner(System.in);
        //System.out.println("enter a no");
        //a=s.nextInt();
        for(i=1;i<=5;i++){
        for(j=1;j<=i;j++)
        {
            if(j%2==1){
            System.out.print("1");
            }
            else{
            System.out.print("0");
            }
            
        }
        System.out.println();
    }
}
}