package Practices;
public class Leap{
    public static void main(String[] args) {
        String[] arr={"sat","Sun","Mon","Tue","Wed","Thurs","Fri"};
        int c=0;
        int n=2009;
        for(int i=1995;i<=n;i++){
            if((i%4==0)&&(i%100!=0)||(i%400==0)){
                c+=2;continue;
            }
            c++;
        }
        if((n%4==0)&&(n%100!=0)||(n%400==0))
        System.out.println(arr[(c%7)-1]);
        else System.out.println(arr[(c%7)]);
    }
}