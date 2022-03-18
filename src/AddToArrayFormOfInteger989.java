/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 14-03-2022
 *   Time: 23:19
 *   File: AddToArrayFormOfInteger989.java
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddToArrayFormOfInteger989 {
    public static void main(String[] args) {


    }

    public List<Integer> addArrayForm(int[] num, int k) {
        int n = num.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + k;
            list.add(sum % 10); // Inserting at the end of arraylist takes O(1) time.
            k = sum / 10;
        }
        while (k > 0) {
            list.add(k % 10);
            k = k / 10;
        }
        Collections.reverse(list); // Reversing will take O(n) time.
        return list;

    }
}

