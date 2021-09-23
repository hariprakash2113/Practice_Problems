package Practices;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String[] s={"hack","a","rank","khac","ackh","kran","rankhacker","a","ab","ba","stairs","raits"};
        String[] q={"a","nark","bs","hack","stair"};
        
        for(int i=0;i<q.length;i++){
            char[] tp=q[i].toCharArray();
            Arrays.sort(tp);int count=0;
            for(int j=0;j<s.length;j++){
                char[] finder=s[j].toCharArray();
                Arrays.sort(finder);
                if(Arrays.equals(finder,tp)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
