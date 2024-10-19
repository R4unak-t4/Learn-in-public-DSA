package Binary.Search;
//Question :
public class PerfectSquare {
    public static void main(String[] args) {

    }
    static boolean BinarySearch(int num){
        int s = 1, e = num;
        while (s<= e){
            int m = s+(e-s)/2;
            long sqr = (long) m*m;
            if (sqr == num){
                return true;
            } else if (sqr > num) {
                e = m-1;

            }else {
                s = m+1;
            }
        }
        return false;

    }
}
