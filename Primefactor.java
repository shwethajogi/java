package primefactor;
import java.util.*;
public class Primefactor {
public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
	System.out.println("enter the number to find the prime factors");
	int num=in.nextInt();
	System.out.println("prime factors are:");
	for(int i=2;i<=num;i++)
	{
		while(num%i==0)
		{
			System.out.print(i+" ");
			num=num/i;
		}
	}
	ArrayList<Integer> a1=new ArrayList<Integer>();
    a1.add(num);
    System.out.println(""+a1);
    
}
}
