package weired;
import java.util.*;
public class OddEvenDemo {
	public static void main(String [] args) {
System.out.println("enter number");
Scanner in = new Scanner(System.in);
int n=in.nextInt();
if(n%2!=0)
{
	System.out.println("number is weired");
}
else if(n%2==0)
{
	if(n>=2 && n<=5)
		System.out.println("num is not weired");
	else if(n>=6 && n<=20)
		System.out.println("num is weired");
	else if(n>20)
		System.out.println("num is not weired");
}
}
}