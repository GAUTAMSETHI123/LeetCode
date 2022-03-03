/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 03-03-2022
 *   Time: 23:58
 *   File: FirstUniqueCharInString.java
 */

public class FirstUniqueCharInString {
    public static void main(String[] args) {

        String s = "leetCode";
        int res = firstUniqChar(s);
        System.out.println(res);

    }
    public static int firstUniqChar(String s) {

        for(int i=0;i<s.length();i++){
            int flag=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
    }
    
}
