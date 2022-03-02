/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 02-03-2022
 *   Time: 23:49
 *   File: ShuffleTheArray.java
 */

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int [] res = shuffle(arr,n);
        System.out.println(Arrays.toString(res));

    }

        public static int[] shuffle(int[] nums, int n) {

            int [] target = new int[2*n];
            int j =0;
            for(int i =0; i<2*n; i+=2){
                target[i] = nums[j];
                target[i+1] = nums[n+j];
                j++;

            }
            return target;

        }
    }

