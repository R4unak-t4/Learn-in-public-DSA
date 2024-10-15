package Binary.Search;
//Question: https://leetcode.com/problems/arranging-coins/description/
public class ArrangingCoin {
    public static void main(String[] args) {

    }
    static int BinarySearch(int n){
        int s = 1, e = n;
        while (s<=e){
            int m = s+(e-s)/2;
            int req = (m/2)*(m+1);
            if (req == n){
                return m;
            }
            else if (n<req){
                e--;
            }else {
                s++;
            }
        }
        return s;
    }
}
