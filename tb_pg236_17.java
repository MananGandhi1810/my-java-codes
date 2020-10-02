import java.util.*;
public class tb_pg236_17{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 9");
        int n=s.nextInt();
        if(n==0){
            System.out.println("you entered ZERO");
        }
        else if(n==1){
            System.out.println("you entered ONE");
        }
        else if(n==2){
            System.out.println("you entered TWO");
        }
        else if(n==3){
            System.out.println("you entered THREE");
        }
        else if(n==4){
            System.out.println("you entered FOUR");
        }
        else if(n==5){
            System.out.println("you entered FIVE");
        }
        else if(n==6){
            System.out.println("you entered SIX");
        }
        else if(n==7){
            System.out.println("you entered SEVEN");
        }
        else if(n==8){
            System.out.println("you entered EIGHT");
        }
        else if(n==9){
            System.out.println("you entered NINE");
        }
        else{
            System.out.println("the number you entered is out of range");
        }
    }
}