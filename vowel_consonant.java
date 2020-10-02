import java.util.*;
public class vowel_consonant
{ 
    public static void main()
    {
       Scanner s=new Scanner(System.in);
       char a;
       System.out.println("Enter an alphabet");
       a=s.next().charAt(0);
       if(a=='a'||a=='A'||a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U'){
       System.out.println("vowel");
    }
    else{
       System.out.println("consonant");
    }
    }
}