/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-03-2022
 *   Time: 23:51
 *   File: PowerOfFour.java
 */

import java.util.Scanner;

public class PowerOfFour342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = recPow(n);
        System.out.println(res);

    }

    public static boolean recPow(int n){
        if(n == 0)
            return false;
        if(n == 1)
            return true;

        if(n%4 == 0){
            return recPow(n/4);
        }
        return false;

    }
}
