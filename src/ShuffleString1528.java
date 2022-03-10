/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 10-03-2022
 *   Time: 23:50
 *   File: ShuffleString1528.java
 */

public class ShuffleString1528 {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for(int i=0;i<s.length();i++) {
            ch[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ch);
    }
}
