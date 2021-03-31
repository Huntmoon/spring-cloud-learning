  //反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。 
//
// 说明: 
//1 ≤ m ≤ n ≤ 链表长度。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL, m = 2, n = 4
//输出: 1->4->3->2->5->NULL 
// Related Topics 链表 
// 👍 646 👎 0

  
  package leetcode.editor.cn;
  public class ReverseLinkedListIi{
      public static void main(String[] args) {
          ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
          Solution solution = new ReverseLinkedListIi().new Solution();
          solution.reverseBetween(listNode, 2, 4);
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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int i =1;
        ListNode node = head;
        ListNode pre=null;
        while (i < m) {
            pre=node;
            node=node.next;
            i++;
        }
        ListNode head1=node;
        ListNode nt=node;
        ListNode nn=node.next;
        for (int j = i; j < n; j++) {
            ListNode tmp = nn.next;
            nn.next = nt;
            nt=nn;
            nn=tmp;
        }
        head1.next=nn;
        if (pre == null) {
            return nt;
        }
        pre.next=nt;
        return head;


    }


}
//leetcode submit region end(Prohibit modification and deletion)

  }