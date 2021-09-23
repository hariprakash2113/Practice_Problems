package Practices;
import java.util.*;
 
public class PrimeSeries{

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();sc.close();
    	int[] arr=new int[n];
    	int index=0;
        for(int i=2;true;i++) {
        	if(index==n)break;
        	if(isPrime(i)) {
        		arr[index]=i;
        		index++;
        	}
        }
        for(int i:arr) {
        	System.out.print(i+" ");
        }
    }
}
