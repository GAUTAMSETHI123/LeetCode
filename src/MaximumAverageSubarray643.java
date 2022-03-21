/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-03-2022
 *   Time: 23:40
 *   File: MaximumAverageSubarray643.java
 */

public class MaximumAverageSubarray643 {

        public double findMaxAverage(int[] nums, int k) {


            int max = 0;
            for(int i = 0; i < k; i++) {
                max += nums[i];
            }
            int curr = max;
            for(int i = k; i < nums.length; i++) {
                curr -= nums[i-k];
                curr += nums[i];
                max = Math.max(curr, max);
            }
            return (max*1.0)/k;
        }
    }


