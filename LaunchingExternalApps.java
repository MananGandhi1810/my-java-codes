import java.lang.*;
import java.util.*;//https://javaconceptoftheday.com/how-to-launch-external-applications-through-java-program/
import java.io.IOException;
public class LaunchingExternalApps
{
    public static void main(String[] args)
    {
        Runtime runtime = Runtime.getRuntime();     //getting Runtime object
 
        String[] s = new String[] {"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://javaconceptoftheday.com/"};
 
        try
        {
            runtime.exec(s);        //opens "https://javaconceptoftheday.com/" in chrome browser
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}