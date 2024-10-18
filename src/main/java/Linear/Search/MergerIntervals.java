package Linear.Search;
//Question : https://leetcode.com/problems/merge-intervals/description/
public class MergerIntervals {
    public static void main(String[] args) {
        int [][] arr = {{1,3},{2,6},{8,10},{15,18}};
    }
    static int [] [] Linear(int [][] intervals){
        int k = 0;
        for (int row = 1; row< intervals.length;row++){
            for (int col = 0; col<intervals[row].length;col++){
                if (intervals[row][0]<=intervals[row-1][1] && intervals[row][1]>=intervals[row-1][1]){
                    intervals [k][0] = intervals[row-1][0];
                    intervals [k][1] = intervals[row][1];
                }
                k++;
            }
        }
        return
    }
}
