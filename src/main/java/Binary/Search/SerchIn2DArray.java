package Binary.Search;
//Question : https://leetcode.com/problems/search-a-2d-matrix/description/

public class SerchIn2DArray {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        int target = 11;
        System.out.println(BinarySearch(matrix,target));
    }
    static Boolean BinarySearch(int [][] matrix, int target){
        int row = 0;
        int col = matrix[row].length-1;
        while (row <= matrix.length-1 && col >=0){
            if (matrix[row][col] == target){
                return true;
            } else if (matrix[row][col]>target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
