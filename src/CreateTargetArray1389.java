/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 02-03-2022
 *   Time: 23:54
 *   File: CreateTargetArray.java
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArray1389 {
    public static void main(String[] args) {

        int [] arr = {0,1,2,3,4};
        int [] arr2 = {0,1,2,2,1};
        int [] res = createTargetArray(arr,arr2);
        System.out.println(Arrays.toString(res));

    }

        public static int[] createTargetArray(int[] nums, int[] index) {
            int [] target = new int[index.length];
            List<Integer> list = new ArrayList<>();
            for(int i =0; i<index.length; i++){
                list.add(index[i], nums[i]);
            }
            for(int i=0; i<target.length; i++){
                target[i] = list.get(i);
            }
            return target;
        }
    }

