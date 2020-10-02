import java.util.*;
public class prime2
{
    public static void main(){
    Scanner s=new Scanner(System.in);
    for(int b=1;b<=100;b--){
    int i,a,c=0;
    System.out.println("enter a no");
    a=s.nextInt();
    for(i=1;i<=a;i++){
        if (a%i==0){
           c++; 
        }
    }
    if (c==2)
    {
        System.out.println("no is prime");
        }
    else{
        System.out.println("no is composite");
    }    
    }
}
}
