package Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListofpermute {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        System.out.println(subseq(up,p));

    }
    static List<String> subseq(String up, String p){
        List<String> ans = new ArrayList<>();
    if (up.isEmpty()){
        ans.add(p);
        return ans;
    }
    List<String> left = subseq(up.substring(1),p+up.charAt(0));
    List<String> right = subseq(up.substring(1),p);
    ans.addAll(left);
    ans.addAll(right);
    return ans;
    }
}
