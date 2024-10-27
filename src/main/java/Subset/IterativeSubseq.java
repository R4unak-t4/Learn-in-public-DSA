package Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterativeSubseq {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<int[]> subsequences = subseq(arr);


        for (int[] seq : subsequences) {
            System.out.println(Arrays.toString(seq));
        }
    }

    static List<int[]> subseq(int[] arr) {
        List<int[]> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                ans.add(Arrays.copyOfRange(arr, i, j));  // Create subsequence from i to j-1
            }
        }

        return ans;
    }
}
