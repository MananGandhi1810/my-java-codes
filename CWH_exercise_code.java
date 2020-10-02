import java.util.*;
public class CWH_exercise_code{
    public static void main(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks of english");
        int eng=s.nextInt();
        System.out.println("Enter marks of hindi");
        int hin=s.nextInt();
        System.out.println("Enter marks of maths");
        int maths=s.nextInt();
        System.out.println("Enter marks of science");
        int sci=s.nextInt();
        System.out.println("Enter marks of computers");
        int comp=s.nextInt();
        int total=eng+hin+maths+sci+comp;
        int percentage=total*100/500;
        System.out.println("your total percentage is: "+percentage+"%");
    }
}