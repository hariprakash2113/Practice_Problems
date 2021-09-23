package Practices;
public class FiboRev {
    public static void main(String[] args) {
        int n=Fibo.sc.nextInt();
        long arr[]=new long[n];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=n-1;i>-1;i--){
            System.out.print(arr[i]+"  ");
        }
    }
}

