package leetcode.list.top100liked;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1, head);

        ListNode pre, s1, s2, suffix;
        pre = s1 = s2 = suffix = null;
        int count = 0;
        pre = dummy;
        ListNode node = dummy.next;
        while (node != null) {
            count ++;
            if(count % 2 == 1) {
                s1 = node;
                node = node.next;
            } else if(count % 2 == 0) {
                s2 = node;
                suffix = s2.next;

                //swap
                pre.next = s2;
                s2.next = s1;
                s1.next = suffix;
                pre = s1;
                node = suffix;
            }
        }

        return dummy.next;
    }
}
