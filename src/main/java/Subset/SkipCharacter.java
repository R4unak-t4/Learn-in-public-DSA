package Subset;

public class SkipCharacter {
    public static void main(String[] args) {
        String str= "baccad", ans = "";
        System.out.println(subset(str,ans));
    }
    static String subset(String str,String ans){
        if (str.isEmpty()) {
            return ans;
        }


        if (str.charAt(0) == 'a') {
            return subset(str.substring(1), ans);
        } else {

            return subset(str.substring(1), ans + str.charAt(0));
        }
    }
}
