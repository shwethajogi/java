package evenorodd;
import java.util.*;
public class EvenOdd {
public static void main(String [] args) {
	System.out.println("enter the number");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	
	if(n%2==0)
	{
		System.out.println("number is even");
	}
	else
		System.out.println("number is odd");
	
}
}

