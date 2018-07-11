package factorial;
import java.util.*;
public class Fact {
public static void main(String [] args)
{
	int i,fact=1;
	Scanner in= new Scanner(System.in);
	System.out.println("enter the number");
	int number=in.nextInt();
	for(i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	System.out.println("factorial of " + number + " is: " + fact);
}
}
