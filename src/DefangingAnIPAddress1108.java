/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 08-03-2022
 *   Time: 23:22
 *   File: DefangingAnIPAddress1108.java
 */

public class DefangingAnIPAddress1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.')
                sb.append("[.]");
            else
                sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}
