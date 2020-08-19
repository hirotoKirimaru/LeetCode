import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int firstCountUp = 0;
        boolean countUp = false;
        digits[digits.length - 1] += 1;
        if (digits[digits.length - 1] == 10) {
            size++;
            firstCountUp = 1;
            countUp = true;
        }
        List<Integer> ints = new ArrayList<>(size);
        // int ints[] = new int[size];

        int tmp = 0;
        for (int i = size - 1; 0 <= i; i--) {
            int index = i - firstCountUp;
            if (index < 0) {
                tmp = 0;
            } else {
                tmp = digits[index];
            }

            if (countUp) {
                if (tmp == 10) {

                } else {
                    tmp += 1;

                }
                if (tmp == 10) {
                    tmp = 0;
                    countUp = true;
                } else {
                    countUp = false;
                }
            }
            ints.add(i, tmp);
            // ints[i] = tmp;
        }
        if (ints.get(0) == 0){
            ints.remove(0);
        }
        
        int[] ints2 = new int[ints.size()];
        for (int j = 0;j <= ints.size(); j++){
            ints2[j] = (int)ints.get(j);
        }

        return ints2;
    }
}
// @lc code=end
