package prime;
import java.util.*;
public class PrimeNumber {
public static void main(String [] args) {
	int sum=0;
	for(int i=2;i<1000;i++)
    {
        int flag=0;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
                flag=1;
        }
        if(flag==0)
        {
            System.out.print(i+" ");
            sum=sum+i;
        }
    }
    System.out.println("Sum = "+sum);
}}