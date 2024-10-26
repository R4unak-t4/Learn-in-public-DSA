package Subset;

public class SkipAppIfNotApple {
    public static void main(String[] args) {
    String str = "bccdapplefd", ans ="";
        System.out.println(Skip(str,ans));
    }
    static String Skip(String str, String ans){
        if (str.isEmpty()){
            return ans;
        }
        if (str.startsWith("apple")){
            return Skip(str.substring(5),ans+"apple");
        }else if (str.startsWith("app")){
            return Skip(str.substring(2),ans);
        }else {
            return Skip(str.substring(1),ans+str.charAt(0));
        }
    }
}
