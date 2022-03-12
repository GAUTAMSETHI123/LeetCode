/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 12-03-2022
 *   Time: 23:40
 *   File: KthLargestElementInAnArray215.java
 */

import java.util.PriorityQueue;

public class KthLargestElementInAnArray215 {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i =0;
        while(i<k){
            pq.add(nums[i]);
            i++;
        }
        while(i<nums.length){
            int min = pq.element();
            if(nums[i]>min){
                pq.remove();
                pq.add(nums[i]);
            }
            i++;
        }
        return pq.remove();

    }
}
