/*   Created by IntelliJ IDEA.
 *   Author: Gautam Sethi (GAUTAMSETHI123)
 *   Date: 06-02-2022
 *   Time: 23:16
 *   File: EvenNoOfDigits1295.java
 */

public class EvenNoOfDigits1295 {
    public static void main(String[] args) {
        int[] array = {12,345,2,6,7896};
        int result = findNumbers(array);
        System.out.println(result);

    }


    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (even(num)) {
                count++;
            }

        }


        return count;
    }



    static boolean even(int num1) {
        int numberOfDigits = count(num1);
        /*
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
         */
        return numberOfDigits % 2 == 0;
    }




    static int count(int num){

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count =0;
        while(num>0){
            count ++;
            num =num/10;
        }
        return count;
    }
}
