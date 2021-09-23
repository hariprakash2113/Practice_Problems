package Practices;

import java.util.Scanner;

public class SuperMarket {
    static long price(long n){
        String s=n+"";
        long res=1;
        for(char i:s.toCharArray()){
            res*=Integer.parseInt(i+"");
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(price(n));
        sc.close();
    }
}
