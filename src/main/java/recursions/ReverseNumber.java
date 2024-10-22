package recursions;

public class ReverseNumber {
    public static void main(String[] args) {

    }
    static int reverse(int num,int rev){
        if (num == 0) {
            return rev;
        }
        rev = rev * 10 + num % 10;
        return reverse(num / 10, rev);
    }
}
