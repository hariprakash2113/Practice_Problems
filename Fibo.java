package Practices;
import java.util.Scanner;
public class Fibo {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n= sc.nextInt();sc.close();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
