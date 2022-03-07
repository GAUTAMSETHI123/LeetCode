/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 07-03-2022
 *   Time: 23:47
 *   File: KidsWithTheGreatestNumberOfCandies.java
 */

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        int result=0;
        for(int i=0;i<candies.length;i++)
        {
            result=candies[i]+extraCandies;
            if(check(candies,result))
            {
                list.add(true);
            }
            else
            {
                list.add(false);
            }

        }

        return list;
    }
    static boolean check(int[]candies,int result)
    {
        for(int i=0;i<candies.length;i++)
        {
            if(result<candies[i])
            {
                return false;
            }

        }
        return true;
    }
}

