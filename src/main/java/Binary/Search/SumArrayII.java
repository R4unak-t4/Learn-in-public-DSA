package Binary.Search;
//Question : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class SumArrayII {
    public static void main(String[] args) {
    }
    static int [] Binary(int [] numbers, int target){
        int s = 0, e = numbers.length -1;
        int [] ans = {-1,-1};
        while(numbers[s]+numbers[e] != target){
            if(numbers[s]+numbers[e] > target){
                e--;
            }else{
                s++;
            }
        }
        return new int [] {s+1,e+1};
    }
    }

}
