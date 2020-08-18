/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        long sum = 0;
        for(int i=0;i<digits.length;i++){  
            sum += (long) (digits[i] * Math.pow(10, (digits.length - 1 -i)));
        }
        sum += 1;

        String str = String.valueOf(sum);

        int ints[] = new int[str.length()];
        int i = 0;
        while (str.length() -i > 0){
            long num =sum % 10;
            sum = sum / 10 ;
            ints[str.length() - 1 -i] = (int)num;
            i++;
        }
    
        return ints;
    }
}
// @lc code=end

