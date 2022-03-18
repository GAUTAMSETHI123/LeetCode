/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 20-02-2022
 *   Time: 22:14
 *   File: ReverseString.java
 */

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
        char[] S = new char[]{'a', 'b', 'c'};
        char [] res = reverseString(S);
        System.out.println(Arrays.toString(S));


    }

    public static char[] reverseString(char[] s) {
        int n = s.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] =  temp;
            start++;
            end--;
        }

        return s;
    }
}
