/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 19-02-2022
 *   Time: 23:50
 *   File: PalindromeNumber.java
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
            int sum =0;
            int temp = x;
            while(x>0){
                int r=x%10;
                sum=(sum*10)+r;
                x=x/10;
            }

            if(temp==sum)
                return true;
            else if (x<0)
                return false;
            else
                return false;

        }
    }

