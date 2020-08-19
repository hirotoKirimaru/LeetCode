import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
public class _1 {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> listInt = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] + nums[j] == target) {
                    listInt.add(i);
                    listInt.add(j);
               }
            }
        }

        int[] rtn = new int[listInt.size()];
        int i = 0;
        for (var a: listInt){
            rtn[i] = a;
            i++;
        }

       return rtn;
    }
}
// @lc code=end

