/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 14-03-2022
 *   Time: 23:19
 *   File: AddToArrayFormOfInteger989.java
 */

import java.util.Arrays;

public class AddToArrayFormOfInteger989 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        int n = 12;
        int [] arr1 = new int[arr.length];

        int factor = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = arr[i] + factor * 10;
            factor = result;
        }

        result = result+n;
        for(int i=0; i<arr1.length-1; i++){
            arr1[i] = 
        }


        System.out.println(Arrays.toString(result));

    }
}
