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

public class LongestPalindromicSubstring2 {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring2().new Solution();
        solution.longestPalindrome("cbbd");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int i = 0, j = 1;
            String r = "";
            while (i < s.length() && j < s.length()) {
//            有回环可能j++z
                int idex = 0;
                if (((idex = j - 1) >= i && s.charAt(idex) == s.charAt(j)) || ((idex = j - 2) >= i && s.charAt(idex) == s.charAt(j))) {
                    int tindex = idex + 1;
                    while (idex >= i && j < s.length() ) {
                        if (s.charAt(idex) == s.charAt(j)) {
                            idex--;
                            j++;
                        }
                    }
                    String tmp = s.substring(idex + 1, j);
                    r = tmp.length() > r.length() ? tmp : r;
                    i = idex+1;
                } else {
                    j++;
                }
            }
            return "".equals(r) ? s.substring(0, 1) : r;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

