package palindrome;
import java.util.*;
public class Palindrome {
public static void main(String[] args) {
	System.out.println("enter the String:");
	Scanner in=new Scanner(System.in);
	String s =in.nextLine();
	char[] strlnchar=s.toCharArray();
	String reverse="";
	for(int i=s.length()-1;i>=0;i--)
	{
		 reverse=reverse+strlnchar[i];
	}
		if(s.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		
		}       
		}
}
