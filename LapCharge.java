package Practices;
public class LapCharge {
    public static void main(String[] args) {
        int[] arr={-10,60,10};
        int curr=50;
        for(int i=0;i<arr.length;i++){
                curr+=arr[i];
                if(curr>100){
                    curr=100;
                }
        }
        System.out.println(curr);
    }
}
