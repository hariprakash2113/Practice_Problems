package Practices;
import java.util.*;
public class Jostech {
    public static void main(String[] args) {
        List <Integer >arr = new ArrayList<Integer>();
        
        arr.add(-7);
        arr.add(-4);
        arr.add(-2);
        arr.add(0);
        arr.add(1);
        int len = arr.size();
        List <Integer> res = new ArrayList<Integer>();
        for(int i=0;i<len;i++){
            res.add(arr.get(i)*arr.get(i));
        }
        for(int i=0;i<len;i++){
            for(int j=len-1;j>i;j--){
        if(res.get(i)>res.get(j)){
            int tmp = res.get(i);
            res.set(i,res.get(j));
            res.set(j,tmp);
        }
            }
        }
        for(int i=0;i<len;i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
