/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-02-2022
 *   Time: 23:57
 *   File: ContainsDuplicate217.java
 */

import java.util.Arrays;

public class ContainsDuplicate217 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,1,2};
        boolean res = containsDuplicate(arr);
    }
    public static boolean containsDuplicate(int[] nums) {

    if (nums == null || nums.length == 0) return false;

   Arrays.sort(nums);
    int l = nums.length;
   for (int i=1; i<l; i++) {
        if (nums[i-1] == nums[i]) {
            return true;
        }
    }
   return false;
}
}
