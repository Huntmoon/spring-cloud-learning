//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//
// 示例 1： 
//
// 输入: "babad"
//输出: "bab"
//注意: "aba" 也是一个有效答案。
// 
//
// 示例 2： 
//
// 输入: "cbbd"
//输出: "bb"
// 
// Related Topics 字符串 动态规划 
// 👍 2879 👎 0


package leetcode.editor.cn;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
        System.out.println(solution.longestPalindrome("xaabacxcabaaxcabaax"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int j = 1;
            String r = "";
            while ( j < s.length()) {
//            有回环可能j++z
                int idex = 0;
                int l = j, k = j;

                while (l - 1 >= 0 && s.charAt(l - 1) == s.charAt(j)) {
                    l--;
                }

                while (k + 1 < s.length() && s.charAt(k + 1) == s.charAt(j)) {
                    k++;
                }

                while (l - 1 >= 0 && k + 1 < s.length()) {
                    if (s.charAt(l - 1) == s.charAt(k + 1)) {
                        l--;
                        k++;
                    } else {
                        break;
                    }
                }

                if (k - l > 0) {
                    String tmp = s.substring(l, k + 1);
                    r = tmp.length() > r.length() ? tmp : r;
                }
                j++;
            }

            return "".equals(r) ? s.substring(0, 1) : r;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}