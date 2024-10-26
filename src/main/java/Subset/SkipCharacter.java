package Subset;

public class SkipCharacter {
    public static void main(String[] args) {
        String str= "baccad", ans = "";
        System.out.println(subset(str,0,ans));
    }
    static String subset(String str,int i,String ans){
    if (i == str.length()){
        return ans;
    }
    if (str.charAt(i) != 'a'){
        ans = ans +str.charAt(i);
    }
    return subset(str,i+1,ans);
    }
}
