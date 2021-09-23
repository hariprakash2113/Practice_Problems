package Practices;

import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paint=sc.nextInt();
        int remove=sc.nextInt();
        sc.close();
        float res1=(float)paint-remove;
        float res2=(res1/paint)*remove;
        res1-=res2;
        System.out.printf("%.2f",res1);
    }
}
