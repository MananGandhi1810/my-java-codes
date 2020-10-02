/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
ardoshi25@gmail.com
*******************************************************************************/

public class web
{
	public static void main(String[] args) {
		try {
    Process p = Runtime.getRuntime().exec("\"/Program Files (x86)/Google/Chrome/Application/chrome.exe\"");
    p.waitFor();
    System.out.println("Google Chrome launched!");
} catch (Exception e) {
    e.printStackTrace();
}
	}
}
