package Practices;

import java.util.Scanner;

public class Crusie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        int curr=0;
        int[] e=new int[n];
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            e[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            l[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int now=e[i]-l[i];
            curr+=now;
            if(max<curr){
                max=curr;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
