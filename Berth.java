package Practices;
import java.util.Scanner;
public class Berth {
    public static void main(String[] args) {
        String berths[] = {"LB","MB","UB"};
        Scanner sc = new Scanner(System.in);
        int curr = sc.nextInt();
        sc.close();
        int curr1=curr%8;
        if(curr1%8==0){
            
            System.out.println((curr-1)+"SL");
        }
        else if(curr1>3 && curr1<7){
           System.out.println((curr-3)+berths[(curr1-3)-1]);
        }
        else if(curr1<=3){
            System.out.println((3+curr)+berths[curr-1]);
        }
        else{
            System.out.println((curr+1)+"SU");
        }

    }
}
