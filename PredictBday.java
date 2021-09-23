package Practices;
import java.util.Scanner;
public class PredictBday {
    static String[] arr={"Thurs","Fri","sat","Sun","Mon","Tue","Wed"};
    static int bday(int yr){
        int c=0;
        for(int i=1921;i<=yr;i++){
            if((i%4==0)&&(i%100!=0)||(i%400==0)){
                c+=2;continue;
            }
            c++;
        }
        if((yr%4==0)&&(yr%100!=0)||(yr%400==0))
        return(c%7)-1;
        return c%7;
    }
    public static void main(String[] args) {
        
        System.out.print("Enter your Birthday --> Seperated by \" \" : ");
        Scanner sc = new Scanner(System.in);
        String birthyr= sc.nextLine();
        String arr[] = birthyr.split(" ");
        int day=bday(Integer.parseInt(arr[2]));
        System.out.println(day);
        sc.close();
        
}
}

