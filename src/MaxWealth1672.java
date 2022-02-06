/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 07-02-2022
 *   Time: 00:28
 *   File: MaxWealth1672.java
 */

public class MaxWealth1672 {
    public static void main(String[] args) {
        int [][] array = {{1,2,3},{3,2,1}};
        int result = maximumWealth(array);
        System.out.println(result);

    }

    static int maximumWealth(int [][] accounts){

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum+ accounts[person][account];


            }

            if(sum > ans){
                ans = sum;
            }


        }
        return ans;
    }
}
