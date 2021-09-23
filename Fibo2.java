package Practices;
import java.util.*;

public class Fibo2{
    public static void main(String[] args) {
        int n=Fibo.sc.nextInt();
        long arr[]=new long[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}