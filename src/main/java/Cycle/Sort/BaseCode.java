package Cycle.Sort;
import java.util.Arrays;

public class BaseCode {
    public static void main(String[] args) {
        int [] arr = {4,5,2,3,1};
        cyclicSort(arr);
    }
    static void cyclicSort(int [] arr){
        int i = 0;
        while (i< arr.length){
            int correct = arr[i]-1;
            if (i == correct){
                i++;
            }else {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
