package aa;

public class Solution1 {
    public static int reverse(int x) {
        int result = 0;
        int digit = 0;
        while (x != 0) {
            digit = x % 10;
            x /= 10;
            result = result*10 + digit;
            if (result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10) {
                return 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println( reverse(-120));

    }
}

