  //给定一个 没有重复 数字的序列，返回其所有可能的全排列。 
//
// 示例: 
//
// 输入: [1,2,3]
//输出:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//] 
// Related Topics 回溯算法 
// 👍 1092 👎 0

  
  package leetcode.editor.cn;

  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  import java.util.stream.Collectors;

  public class Permutations{
      public static void main(String[] args) {
           Solution solution = new Permutations().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
          private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {

        List<Integer> collect = new ArrayList<>();
        Arrays.stream(nums).forEach(collect::add);
        re(new ArrayList<>(), collect);
        return result;
    }
          private void re(List<Integer> asList, List<Integer> rest) {
              if (rest.isEmpty()) {
                  result.add(asList);
              }
              for (int i = 0; i < rest.size(); i++) {
                  ArrayList<Integer> integers = new ArrayList<>(rest);
                  ArrayList<Integer> inList = new ArrayList<>(asList);
                  inList.add(integers.remove(i));
                  re(inList,integers);
              }
          }
}


//leetcode submit region end(Prohibit modification and deletion)

  }