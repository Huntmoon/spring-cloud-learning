  //给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。 
//
// 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。 
//
// 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 示例： 
//
// 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 0 -> 8
//原因：342 + 465 = 807
// 
// Related Topics 链表 数学 
// 👍 5200 👎 0

  
  package leetcode.editor.cn;
  public class AddTwoNumbers{
      public static void main(String[] args) {
           Solution solution = new AddTwoNumbers().new Solution();
      }
      //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        进位
        return getListNode(l1, l2,0);
    }

    private ListNode getListNode(ListNode l1, ListNode l2,int inc) {
        if (l1==null && l2==null && inc==0) {
            return null;
        }

        int val1 = l1 == null ? 0 : l1.val;
        int val2 = l2 == null ? 0 : l2.val;

        ListNode l1Next = l1 == null ? null : l1.next;
        ListNode l2Next = l2 == null ? null : l2.next;
        int val = val1+val2+inc;
        int tval = val / 10;
        int nval = val % 10;
        ListNode listNode = new ListNode(nval);
        ListNode listNode1 = getListNode(l1Next, l2Next,tval);
        listNode.next = listNode1;
        return listNode;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

  }