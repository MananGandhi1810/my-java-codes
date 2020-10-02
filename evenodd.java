import java.util.*;
public class evenodd
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       double no;
       int i;
       for(i=1;i<=10;i++){
       System.out.println("Enter a no");
       no=Math.abs(s.nextDouble());
       
       if(no!=0&&no%2==1){
       System.out.println("no is odd");
    }
       if(no!=0&&no%2==0){
       System.out.println("no is even");
    }
    if(no==0){
    System.out.println("program is ending");
    break;
    }
}
    }
}