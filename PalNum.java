package Practices;

public class PalNum {
    static boolean isPal(long n){
    String y=n+"";
    StringBuffer x = new StringBuffer(y);
    if(y.equals(x.reverse().toString())){
        return true;
    }
    return false;
    }
    public static void main(String[] args) {
        long n=Fibo.sc.nextLong();
        System.out.println(isPal(n));
    }
}
