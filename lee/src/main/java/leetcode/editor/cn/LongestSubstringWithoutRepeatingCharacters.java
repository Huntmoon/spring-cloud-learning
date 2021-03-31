//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
//
// 示例 1: 
//
// 输入: "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 输入: "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 输入: "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 4538 👎 0


package leetcode.editor.cn;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character, List<Integer>> map = new HashMap<>();
            char[] chars = s.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (!map.containsKey(chars[i])) {
                    map.put(chars[i], new ArrayList<>());
                }
                map.get(chars[i]).add(i);
            }

            List<Integer[]> a = new ArrayList<>();

            Collection<List<Integer>> values = map.values();
            for (List<Integer> value : values) {
                for (int i = 0; i < value.size(); i++) {
                    int l = i == 0 ? 0 : value.get(i - 1) + 1;
                    int r = i == value.size() - 1 ? s.length() : value.get(i + 1);
                    a.add(new Integer[]{l, r});
                }
            }

            int k = 0;
            for (int i = 0; i < a.size(); i++) {
                int is = a.get(i)[0];
                int ie = a.get(i)[1];
                for (int j = i + 1; j < a.size(); j++) {
                    int js = a.get(j)[0];
                    int je = a.get(j)[1];
//                    前面的更短
                    if (is >= js && ie < je) {
                        a.set(j, a.get(i));
                        k++;
                        break;
                    } else if (is < js && ie > je) {
//                        Integer[] tmp = a.get(i);

                        break;
                    }
                }
            }

            int len = 1;
            for (int i = k; i < a.size(); i++) {
                int thisLen = a.get(i)[1] - a.get(i)[0];
                System.out.printf("%d-%d \n", a.get(i)[1], a.get(i)[0]);
                len = Math.max(len, thisLen);
            }
            return len;


        }

        private boolean isRepeat(String tmp, Map<Character, List<Integer>> map, int start, int end) {
            char[] chars = tmp.toCharArray();
            for (char aChar : chars) {
                List<Integer> integers = map.get(aChar);
                int num = 0;
                for (Integer integer : integers) {
                    if (integer < end && integer >= start) {
                        num++;
                        if (num > 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)
