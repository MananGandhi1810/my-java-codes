import java.util.*;
public class nested_names
{
    public static void main(){
        int  i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a name");
        String a=s.next();
        for(i=2;i<=5;i++){
        for(j=1;j<=i;j++)
        {
            System.out.print(a);
        }
        System.out.println();
    }
}
}
