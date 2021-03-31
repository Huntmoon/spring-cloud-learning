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

public class LongestPalindromicSubstring1 {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring1().new Solution();
        System.out.println(solution.longestPalindrome("babad"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int i = 0, j = 1;
            String r = "";
            while (i < s.length() && j < s.length()) {
//            有回环可能j++


                boolean b = false;
                while (j < s.length()) {
                    String tmp = s.substring(i, j + 1);
                    if (iscc(tmp)) {
                        b = true;
                        j++;
                    } else {
                        if (b) {
                            r = tmp.length() > r.length() ? s.substring(i,j) : r;
                            i = i + tmp.length() / 2;
                            break;
                        } else {
                            j++;
                        }
                    }
                }

            }
            return "".equals(r) ? s.substring(0, 1) : r;
        }

        private boolean iscc(String tmp) {
            for (int i = 0, j = tmp.length() - 1; i < j; i++, j--) {
                if (tmp.charAt(i) != tmp.charAt(j)) {
                    return false;
                }
            }
            return true;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
