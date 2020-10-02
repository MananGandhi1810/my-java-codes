import java.util.*;
public class sumEvenOdd{
    public static void main(){
        Scanner s=new Scanner(System.in);
        int a,odd=0,even=0;
        System.out.println("enter a no");
        a=s.nextInt();
        while(a!=0){
            System.out.println("enter a no");
            a=s.nextInt();
         if(a!=0&&a%2==1){
         System.out.println("no is odd");
         odd=odd+a;
         }
         if(a!=0&&a%2==0){

          even=even+a;
         }
        }
        System.out.println("sum of even= "+even);
        System.out.println("sum of odd= "+odd);
}
}