/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-02-2022
 *   Time: 23:12
 *   File: plusOne66.java
 */

import java.util.Arrays;

public class plusOne66 {
    public static void main(String[] args) {

        int[] digits = {9};
        int [] result = plusOne(digits);
        System.out.println(Arrays.toString(result));

    }
    public static int [] plusOne(int [] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] rst = new int[digits.length + 1];
            rst[0] = 1;
            return rst;
        }
        return digits;
    }
}
