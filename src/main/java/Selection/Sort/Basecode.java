package Selection.Sort;


import java.util.Arrays;

public class Basecode {
    public static void main(String[] args) {
        int [] arr = {-2,-4,-6};
    selectionSort(arr);
    }
    static void selectionSort(int [] arr){
        for (int i = 0; i< arr.length;i++){

            int lastIndex = arr.length-i-1;
            int maxElement = FindMax(arr,0,lastIndex);
            if (maxElement != lastIndex){
                int temp = arr[lastIndex];
               arr[lastIndex]=arr[maxElement];
               arr[maxElement] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static int FindMax(int [] arr, int s, int e){
        int max = s;
        for (int i = s; i <= e;i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
