package Linear.Search;
//This question has multiple answers
//Question Link : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/?envType=daily-question&envId=2024-10-09
public class MInimumAddPrarenthesis {
    public static void main(String[] args) {
        String s = ")(";
        System.out.println(minMOve(s));
    }
    static int minMOve(String s){
        int open = 0, unclosed = 0;
        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                open++;
            }else {
                if (open>0){
                    open--;
                }else {
                    unclosed++;
                }
            }
        }
        return unclosed+open;
    }
}
