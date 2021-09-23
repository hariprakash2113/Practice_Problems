package Practices;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = m>n ? m : n;
        for(int i=max/2;i>-1;i--){
            if(m%i==0 && n%i==0){
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}
