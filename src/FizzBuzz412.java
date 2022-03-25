/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 25-03-2022
 *   Time: 23:50
 *   File: FizzBuzz412.java
 */

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> FizzBuzz(int n) {
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 1; i<=n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            }
            else if(i % 3 == 0){
                list.add("Fizz");
            }
            else if(i % 5 == 0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        return list;

    }
}
