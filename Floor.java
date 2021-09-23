package Practices;
import java.util.Scanner;
public class Floor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        int x=sc.nextInt();
        System.out.println((y*y)-(x*x));
        sc.close();
    }
}
