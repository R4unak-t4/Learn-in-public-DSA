package recursions;

import java.util.ArrayList;
import java.util.List;

public class AsciiOfStr {
    public static void main(String[] args) {
    String str = "abc";
    String p ="";
    System.out.println(subseq(str,p));
    }
    static List<String> subseq(String up, String p){
        List<String> ans = new ArrayList<>();
        if(up.isEmpty()){
            ans.add(p);

            return ans;
        }
        List<String> left = subseq(up.substring(1),p+up.charAt(0));
        List<String> right = subseq(up.substring(1),p);
        List<String> ascii = subseq(up.substring(1),p + (int) up.charAt(0));
        ans.addAll(left);
        ans.addAll(right);
        ans.addAll(ascii);
        return ans;
    }

}
