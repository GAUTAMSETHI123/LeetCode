/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 15-02-2022
 *   Time: 23:47
 *   File: BuyAndSellStock121.java
 */

public class BuyAndSellStock121 {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};

        int result = maxProfit(arr);
        System.out.println(result);

    }



    public static int maxProfit(int[] prices) {
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        left[0] = prices[0];
        right[prices.length-1] = prices[prices.length-1];
        for(int i=1; i<prices.length; i++){
            left[i] = Math.min(left[i-1],prices[i]);
        }
        for(int i = prices.length-2; i>=0; i--){
            right[i] = Math.max(right[i+1],prices[i]);
        }
        int max =0;
        for(int i=0; i<prices.length; i++){
            max = Math.max(max,right[i]-left[i]);
        }
        return max;
    }
}
