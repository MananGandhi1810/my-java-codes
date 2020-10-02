import java.util.*;
class UserName_Password
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int password;
        System.out.println("Hello enter your name(first letter in CAPITAL)");
        String name=s.next();
        System.out.println(name);
        if(name.equals("Harshil"))
        {
            System.out.println("Hello Captain");
        }
        else if(name.equals("Hitansh"))
        {
            System.out.println("Hello Captains Bro:HITANSH:");
        }
        else
        {
            System.out.println("Hello "+name);
        }
        System.out.println("Please enter the password to continue");
        password=s.nextInt();
        switch(password)
        {
            case 1234:
                     System.out.println("Acess Granted");
                     break;
            default:
                     System.out.println("Acess Denied");
        }
    }
}
