//给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
//
// 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？ 
//
// 
//
// 示例 1： 
//
// 输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 示例 3： 
//
// 输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
// 
//
// 示例 4： 
//
// 输入：nums1 = [], nums2 = [1]
//输出：1.00000
// 
//
// 示例 5： 
//
// 输入：nums1 = [2], nums2 = []
//输出：2.00000
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
// Related Topics 数组 二分查找 分治算法 
// 👍 3371 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Solution solution = new MedianOfTwoSortedArrays().new Solution();
        solution.findMedianSortedArrays(new int[]{1}, new int[]{1});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        一个中进行二分选择，另一个进行二分查找
//        判断是否满足条件
//        确定中心位的位置
            int mid = nums1.length + nums2.length;
            if (mid % 2 == 0) {
                double d1 = getNum(nums1, nums2, mid / 2);
                double d2 = getNum(nums1, nums2, mid / 2 - 1);
                return (d1 + d2) / 2d;
            } else {
                return getNum(nums1, nums2, mid / 2);
            }


        }

        private Double getNum(int[] nums1, int[] nums2, int i) {
            Double r = getIndex(nums1, nums2, i);
            return r != null ? r : getIndex(nums2, nums1, i);
        }

        //        从1中取数到2中去查找 两层二分搜索算法的叠加
        private Double getIndex(int[] nums1, int[] nums2, int i) {
            for (int l = 0, r = nums1.length - 1; l <= r; ) {
                int m = (l + r) / 2;
                Integer[] otherIndex = getIndex1(nums2, nums1[m]);
                // 相等则找到位置
//存在多个相同数字的多个索引位置
                for (int i1 = 0; i1 < otherIndex.length; i1++) {
                    if (m + otherIndex[i1] == i) {
                        return Double.valueOf(nums1[m]);
//                    最小索引大于目标索引则左移
                    }
                }
                if (m + otherIndex[0] > i) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
//            throw new IllegalStateException();
            return null;
        }

        //         i 应该放在nums2中的哪个位置
        private Integer[] getIndex1(int[] nums2, int i) {
//            if (nums2.length == 0 || nums2[0] >= i) {
//                return 0;
//            }
            for (int l = 0, r = nums2.length - 1; l <= r; ) {
                int m = (l + r) / 2;
                int lv = m == 0 ? Integer.MIN_VALUE : nums2[m - 1];
                int rv = m == nums2.length - 1 ? Integer.MAX_VALUE : nums2[m + 1];
                if (i == nums2[m]) {
                    List<Integer> result = new ArrayList<>();
                    int min = m;
                    int j = 1;
                    while (((m - j)) >= 0 && nums2[m] == nums2[m - j]) {
                        min = (m - j);
                        j++;
                    }
                    int max = m;
                    int k = 1;
                    while (((m + k)) < nums2.length && nums2[m] == nums2[m + k]) {
                        max = (m + k);
                        k++;
                    }
                    for (int n = min; n <= max; n++) {
                        result.add(n);
                    }
                    result.add(max + 1);

                    Integer[] ints = new Integer[result.size()];

                    return result.toArray(ints);
                } else if (i > nums2[m]) {
                    if (rv > i) {
                        return new Integer[]{m + 1};
                    } else {
                        l = m + 1;
                    }
                } else {
                    if (lv < i) {
                        return new Integer[]{m};
                    } else {
                        r = m - 1;
                    }
                }
            }
            return new Integer[]{0};
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}