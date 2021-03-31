  //给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。 
//
// candidates 中的每个数字在每个组合中只能使用一次。 
//
// 说明： 
//
// 
// 所有数字（包括目标数）都是正整数。 
// 解集不能包含重复的组合。 
// 
//
// 示例 1: 
//
// 输入: candidates = [10,1,2,7,6,1,5], target = 8,
//所求解集为:
//[
//  [1, 7],
//  [1, 2, 5],
//  [2, 6],
//  [1, 1, 6]
//]
// 
//
// 示例 2: 
//
// 输入: candidates = [2,5,2,1,2], target = 5,
//所求解集为:
//[
//  [1,2,2],
//  [5]
//] 
// Related Topics 数组 回溯算法 
// 👍 477 👎 0

  
  package leetcode.editor.cn;

  import java.util.ArrayList;
  import java.util.HashSet;
  import java.util.List;
  import java.util.Set;

  public class CombinationSumIi{
      public static void main(String[] args) {
           Solution solution = new CombinationSumIi().new Solution();
           solution.combinationSum2(new int[]{10,1,2,7,6,1,5},8);
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
          private Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        /*
        1. 状态当前数字的和，当前的集合,剩余的集合中取值
        2. 退出时判断 target=8   target>8  target< continue
         */
        List<List<Integer>> r = new ArrayList<>();
        re(candidates,0, r, new ArrayList<Integer>(), 0, target);
        r.sort((o1, o2) -> {
            for (int i = 0; ; i++) {
                if (o1.size() == i) {
                    return -1;
                }
                if (o2.size() == i) {
                    return 1;
                }
                if (o1.get(i).equals(o2.get(i))) {
                } else {
                    return o1.get(i).compareTo(o2.get(i));
                }
            }
        });
        return r;
    }
          private void re(int[] candidates,int index, List<List<Integer>> r, ArrayList<Integer> integers, int acc, int target) {
              if (!set.add(integers)) {
                  return;
              }
              if (acc == target) {
                  integers.sort(Integer::compareTo);
                  if (!r.contains(integers)) {
                      r.add(integers);
                  }
                  return;
              }
              if (acc > target || index==candidates.length) {
                  return;
              }
              re(candidates,index+1,r,new ArrayList<>(integers),acc,target);
              ArrayList<Integer> integers1 = new ArrayList<>(integers);
              integers1.add(candidates[index]);
              re(candidates,index+1,r,integers1,acc+candidates[index],target);

          }

}
//leetcode submit region end(Prohibit modification and deletion)

  }