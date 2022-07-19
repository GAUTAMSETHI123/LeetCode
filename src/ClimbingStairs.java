/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-07-2022
 *   Time: 23:00
 *   File: ClimbingStairs.java
 */

public class ClimbingStairs {

    public static int climbingFunc(int curr, int n){
        if(curr==n){
            return 1;
        }
        if(curr>n){
            return 0;

        }

        int choice1 = climbingFunc(curr+1, n);
        int choice2 = climbingFunc(curr+2, n);

        return choice1 +choice2;

    }

    public static void main(String[] args) {
        int ans = climbingFunc(0,4 );
        System.out.println(ans);
    }

}
