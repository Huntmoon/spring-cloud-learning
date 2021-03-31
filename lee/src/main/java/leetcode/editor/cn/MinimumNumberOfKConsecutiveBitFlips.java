  //在仅包含 0 和 1 的数组 A 中，一次 K 位翻转包括选择一个长度为 K 的（连续）子数组，同时将子数组中的每个 0 更改为 1，而每个 1 更改为 0
//。 
//
// 返回所需的 K 位翻转的次数，以便数组没有值为 0 的元素。如果不可能，返回 -1。 
//
// 
//
// 示例 1： 
//
// 输入：A = [0,1,0], K = 1
//输出：2
//解释：先翻转 A[0]，然后翻转 A[2]。
// 
//
// 示例 2： 
//
// 输入：A = [1,1,0], K = 2
//输出：-1
//解释：无论我们怎样翻转大小为 2 的子数组，我们都不能使数组变为 [1,1,1]。
// 
//
// 示例 3： 
//
// 输入：A = [0,0,0,1,0,1,1,0], K = 3
//输出：3
//解释：
//翻转 A[0],A[1],A[2]: A变成 [1,1,1,1,0,1,1,0]
//翻转 A[4],A[5],A[6]: A变成 [1,1,1,1,1,0,0,0]
//翻转 A[5],A[6],A[7]: A变成 [1,1,1,1,1,1,1,1]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= A.length <= 30000 
// 1 <= K <= A.length 
// 
// Related Topics 贪心算法 Sliding Window 
// 👍 42 👎 0

  
  package leetcode.editor.cn;
  public class MinimumNumberOfKConsecutiveBitFlips{
      public static void main(String[] args) {
           Solution solution = new MinimumNumberOfKConsecutiveBitFlips().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minKBitFlips(int[] A, int K) {
//        int size = A.length;
//        int result = 0;
//        for (int i = 0; i < size; i++) {
//            if (A[i] == 0) {
//                if (i + K > size) {
//                    return -1;
//                } else {
//                    for (int j = i; j < i + K; j++) {
//                        A[j] ^= 1;
//                    }
//                    result++;
//                }
//            }
//        }
//        return result;
//        1. 翻转次数  2. 头指针
//        判定是否翻转--位置指针
        int r = 0;
        for (int i = 0; i < A.length; ) {
            if (A[i] == 0) {
                if (A.length - i < K) {
                    return -1;
                }
                int inc = 0;
                for (int j = K - 1; j >= 0; j--) {

                    int idx = i + j;
                    if (A[idx] == 1) {
//                        A[idx] = 1;
                        inc = j;
                    }
                    A[idx] ^=1;

                }
                i = inc + i;
                r++;
            } else {
                i++;
            }
        }
        return r;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

  }