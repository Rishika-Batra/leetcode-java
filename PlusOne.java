import java.util.*;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from end
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // no carry needed
                return digits;
            }
            digits[i] = 0;     // carry continues
        }

        // If all digits were 9 → need extra space
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        int[] result = plusOne(digits);

        System.out.println(Arrays.toString(result)); // [1, 0, 0, 0]
    }
}
