package leetcode.top100liked.list;

//https://leetcode.cn/problems/reverse-linked-list/description/?envType=study-plan-v2&envId=top-100-liked
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while(current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
