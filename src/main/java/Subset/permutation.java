package Subset;

public class permutation {
    public static void main(String[] args) {
    String str = "abc";
    String p ="";
    subseq(str,p);
    }
    static void subseq (String up, String p){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        subseq(up.substring(1),p+up.charAt(0));
        subseq(up.substring(1),p);
    }
}
