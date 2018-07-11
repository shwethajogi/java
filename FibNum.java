package fibonacci;
import java.util.*;
public class FibNum {
public static void main(String [] args) {
	int a=0,b=1,c=0;
	System.out.println("enter the range of numbers");
	Scanner in=new Scanner(System.in);
	int num=in.nextInt();
	for(int i=1;i<=num;i++) {
		
		c=a+b;
	a=b;
	b=c;
		
	}
	System.out.println("sum is:"+c);
}
}
