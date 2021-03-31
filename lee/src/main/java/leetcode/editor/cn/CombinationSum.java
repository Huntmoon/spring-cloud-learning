//给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
// candidates 中的数字可以无限制重复被选取。 
//
// 说明： 
//
// 
// 所有数字（包括 target）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1： 
//
// 输入：candidates = [2,3,6,7], target = 7,
//所求解集为：
//[
//  [7],
//  [2,2,3]
//]
// 
//
// 示例 2： 
//
// 输入：candidates = [2,3,5], target = 8,
//所求解集为：
//[
//  [2,2,2,2],
//  [2,3,3],
//  [3,5]
//] 
//
// 
//
// 提示： 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// candidate 中的每个元素都是独一无二的。 
// 1 <= target <= 500 
// 
// Related Topics 数组 回溯算法 
// 👍 1130 👎 0


package leetcode.editor.cn;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        private Set<List<Integer>> set = new HashSet<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            List<List<Integer>> result = new ArrayList<>();
            re(candidates, 0, result, new ArrayList<>(), 0, target);
            return result;
        }

        private void re(int[] c, int s, List<List<Integer>> result, List<Integer> before, int acc, int target) {
            if (s == c.length) {
                return;
            }
            if (!set.add(before)) {
                return;
            }
            for (int i = s; i < c.length; i++) {

                int tv = c[i];
                int sum = acc;
                ArrayList<Integer> integers = new ArrayList<>(before);
                while (true) {
                    integers.add(tv);
                    sum += tv;
                    if (sum > target) {
                        break;
                    } else if (sum == target) {
                        result.add(integers);
                        break;
                    } else {
                        ArrayList<Integer> integers1 = new ArrayList<>(integers);
                        re(c, i+1, result, integers1, sum, target);
                    }
                }
            }
//            re(c, s + 1, result, new ArrayList<>(), 0, target);
        }
    }


//leetcode submit region end(Prohibit modification and deletion)

}