package Linear.Search;

import java.util.Arrays;

// Question: https://leetcode.com/problems/merge-intervals/description/
public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] mergedIntervals = merge(arr);
        System.out.println(Arrays.deepToString(mergedIntervals));
    }

    static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by their starting points.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Use a pointer to keep track of the position for merging.
        int k = 0;

        for (int i = 1; i < intervals.length; i++) {
            // Check if the current interval overlaps with the last merged interval.
            if (intervals[k][1] >= intervals[i][0]) {
                // Merge intervals if they overlap.
                intervals[k][1] = Math.max(intervals[k][1], intervals[i][1]);
            } else {
                // Move to the next interval to place the non-overlapping interval.
                k++;
                intervals[k] = intervals[i];
            }
        }

        // Return the merged intervals up to index k.
        return Arrays.copyOfRange(intervals, 0, k + 1);
    }
}