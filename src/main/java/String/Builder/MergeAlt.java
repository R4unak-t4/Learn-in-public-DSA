package String.Builder;
//Question : https://leetcode.com/problems/merge-strings-alternately/description/
public class MergeAlt {
    public static void main(String[] args) {
    String word1 = "ab", word2 = "pqrs";
        System.out.println(Merge(word1,word2));
    }
    static String Merge(String word1, String word2){
        int i = 0;
        StringBuilder ans = new StringBuilder();

        while (i<word1.length() || i<word2.length()){
            if (i<word1.length()){
                ans.append(word1.charAt(i));
            }
            if (i<word2.length()){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
}
