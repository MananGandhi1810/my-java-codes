import java.util.*;
public class birthday_game{
        public static void main(){
            Scanner s =new Scanner(System.in);
            System.out.println("I am akinator the magician");
            System.out.println("I will guess your birthday");
            System.out.println("multiply your date of birth by 2");
            System.out.println("add 5 to the number");
            System.out.println("multiply it by 50");
            System.out.println("add your birth month to the number");
            System.out.println("Subtract 250 from the number");
            System.out.println("Enter your number");
            int a=s.nextInt();
            int birthday=a/100;
            int month=a-birthday*100;
            System.out.println("birthday: "+birthday);
            System.out.println("birth month: "+month);
        }
}