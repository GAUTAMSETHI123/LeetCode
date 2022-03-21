/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 21-03-2022
 *   Time: 23:40
 *   File: MaximumAverageSubarray643.java
 */

public class MaximumAverageOfSubarray643 {

        public double findMaxAverage(int[] nums, int k) {


            int max = 0;
            for(int i = 0; i < k; i++) {
                max += nums[i];
            }
            int current = max;
            for(int i = k; i < nums.length; i++) {
                current -= nums[i-k];
                current += nums[i];
                max = Math.max(current, max);
            }
            return (max*1.0)/k;
        }
    }


