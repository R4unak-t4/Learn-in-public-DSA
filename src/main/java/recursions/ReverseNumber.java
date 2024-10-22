package recursions;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(293));
    }
    static int reverse(int num){
        int digit = (int) Math.log10(num);
        if (num<10){
            return num;
        }
        return (int) ((int) num%10 * Math.pow(10,digit) + reverse(num/10));
    }
}
