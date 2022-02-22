/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 23-02-2022
 *   Time: 02:26
 *   File: MajorityElement.java
 */

import java.util.Arrays;

public class MajorityElement169 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1,1,2,4};

        int res = majorityElement(arr);
        System.out.println(res);


    }

    public static int majorityElement(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int count =0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;

                }

            }
            if(count > nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
    }

