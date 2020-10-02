import java.util.*;
public class newcalc{
    public static double add(double a,double b){
        return (a+b);
    }
    public static double sub(double a,double b){
        return (a-b);
    } 
    public static double mul(double a,double b){
        return (a*b);
    }
    public static double div(double a,double b){
        return (a/b);
    } 
    static void main(){
        Scanner s=new Scanner(System.in);
        double result;
        double a,b,c;
        System.out.println("please enter first number");
        a=s.nextDouble();
        System.out.println("please enter second number");
        b=s.nextDouble();
        System.out.println("please enter 1 for addition");
        System.out.println("please enter 2 for subtraction");
        System.out.println("please enter 3 for multiplication");
        System.out.println("please enter 4 for division");
        c=s.nextDouble();
        if (c==1){
            result=add(a,b);
            System.out.println(result);
        }
        else if (c==2){
            result=sub(a,b);
            System.out.println(result);
        }
        else if (c==3){
            result=mul(a,b);
            System.out.println(result);
        }
        else if (c==4){
            result=div(a,b);
            System.out.println(result);
        }
        else{
            System.out.println("please give a valid input");
        }
    }
}