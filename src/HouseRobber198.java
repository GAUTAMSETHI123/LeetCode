/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 08-03-2022
 *   Time: 23:26
 *   File: HouseRobber198.java
 */

public class HouseRobber198 {
    public int houseRob(int[] nums) {

        if(nums.length==1)
            return nums[0];
        if(nums.length==2)

            return Math.max(nums[0],nums[1]);

        int[] dp=new int[nums.length];

        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){

            int visited=nums[i]+dp[i-2];
            int notvisit=dp[i-1];
            dp[i]=Math.max(visited,notvisit);
        }
        return dp[nums.length-1];

    }
}
