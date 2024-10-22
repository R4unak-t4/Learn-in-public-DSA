package recursions;

public class plaindrome {
    public static void main(String[] args) {
        int num = 292;
        int reversed = solution(num);

        if (num == reversed) {
            System.out.println("The number is a palindrome");
        } else {
            System.out.println("The number is not a palindrome");
        }
    }

    static int solution(int num) {
        // Base case: if the number has only one digit, return that digit
        if (num < 10) {
            return num;
        }
        // Get the number of digits in the number
        int digit = (int) Math.log10(num);
        // Reverse the number recursively
        return (int) (num % 10 * Math.pow(10, digit) + solution(num / 10));
    }
}