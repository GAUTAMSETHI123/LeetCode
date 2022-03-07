/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 07-03-2022
 *   Time: 23:53
 *   File: FirstAndLastOccurenceOfAnElement.java
 */
import java.util.*;
public class FirstAndLastPositionOfAnElementInAnSortedArray34 {




        static void findFirstAndLastPosition(int arr[],int n,int target)
        {
            // We initialize first and last as -1 if the target is not present in the array.
            int firstPosition = -1;
            int last = -1;

            for(int i=0;i<n;i++)
            {
                if(arr[i] == target)
                {
                    firstPosition = i;
                    break;
                }
            }

            for(int i=n-1;i>=0;i--)
            {
                if(arr[i] == target)
                {
                    last = i;
                    break;
                }
            }

            System.out.println("The First occurrence of "+target+" at index : "+firstPosition+" and the Last occurrence is at index : "+last);
        }

        public static void main(String args[])
        {
            int arr[] = new int[]{2,3,4,5,5,7,7,7,9,11};
            int n = arr.length;

            int target = 7;
            findFirstAndLastPosition(arr,n,target);

        }

    }

