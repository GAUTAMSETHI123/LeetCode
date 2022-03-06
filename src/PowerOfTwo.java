/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 05-03-2022
 *   Time: 23:51
 *   File: PowerOfTwo.java
 */

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = recursivePower(n);
        System.out.println(res);

    }

    public static boolean recursivePower(int n){
        if(n == 0)
            return false;
        if(n == 1)
            return true;

        if(n%2 == 0){
            return recursivePower(n/2);
        }
        return false;

    }
}
