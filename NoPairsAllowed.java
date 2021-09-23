package Practices;
import java.util.*;
public class NoPairsAllowed {
    static List<Integer> dup(List<String> h){
        List<Integer> x = new ArrayList<>();
        for(String i:h){
            int c=0;
            char[] r = i.toCharArray();
            for(int j=0;j<r.length-1;j++){
                if(r[j]==r[j+1]){
                    c++;
                    r[j+1]='!';
                }
            }
            x.add(c);
        }
        return x;

    }
    public static void main(String[] args) {
        List<String> m=Arrays.asList("add","boook","break","hello","boooook");//bo!o!ok
        List<Integer> x =dup(m);
        System.out.println(x.toString());
    }

}
