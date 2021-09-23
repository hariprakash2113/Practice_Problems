package Practices;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        int oc=0;int ec=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)ec++;
            else oc++;
        }
        sc.close();
        System.out.println(ec+" "+oc);
    }
}
