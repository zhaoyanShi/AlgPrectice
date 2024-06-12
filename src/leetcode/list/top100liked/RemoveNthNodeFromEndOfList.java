package leetcode.list.top100liked;

//https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/?envType=study-plan-v2&envId=top-100-liked
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getLength(head);
        ListNode dummy = new ListNode(0, head);
        int index = length - n + 1;
        ListNode node = dummy;
        for (int i = 1; i <= index-1 ; i++) {
            node = node.next;
        }
        ListNode toRemove = node.next;
        ListNode next = toRemove.next;
        node.next = next;

        return dummy.next;
    }

    int getLength(ListNode head) {
        int count = 0;
        while(head != null) {
            count ++;
            head = head.next;
        }
        return count;
    }
}
