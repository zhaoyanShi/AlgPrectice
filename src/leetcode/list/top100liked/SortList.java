package leetcode.list.top100liked;

//https://leetcode.cn/problems/sort-list
public class SortList {

    public ListNode sortList(ListNode head) {
        return sortList(head, null);
    }

    ListNode sortList(ListNode head, ListNode tail) {
        if (head == null) return head;
        if (head.next == tail) {
            head.next = null;
            return head;
        }

        ListNode slow = head, fast = head;
        while(fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if(fast != tail) {
                fast = fast.next;
            }
        }

        ListNode mid = slow;
        ListNode list1 = sortList(head, mid);
        ListNode list2 = sortList(mid, tail);

        return mergeList(list1, list2);
    }

    ListNode mergeList(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy, n1 = h1, n2 = h2;
        while (n1 != null && n2 != null) {
            if(n1.val <= n2.val) {
                tmp.next = n1;
                n1 = n1.next;
            } else {
                tmp.next = n2;
                n2 = n2.next;
            }
            tmp = tmp.next;
        }

        if(n1 == null) tmp.next = n2;
        else if (n2 == null) tmp.next = n1;

        return dummy.next;
    }
}
