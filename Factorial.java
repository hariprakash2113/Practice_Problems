package Practices;

public class Factorial {
    static long fact(long n){
        if(n==0 || n==1)return 1;
        return n*fact(n-1);
    }
public static void main(String[] args) {
    long x = fact(20);
    System.out.println(x);
}
}
