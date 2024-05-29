package leetcode.top100liked.list;

public class Merge2SortedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode();
        ListNode current = node;

        ListNode a = list1;
        ListNode b = list2;
        while(a != null && b != null) {
            if (a.val <= b.val) {
                current.next = a ;
                a = a.next;
            } else {
                current.next = b;
                b = b.next;
            }
            current = current.next;
        }

        if( a == null ) current.next = b;
        else if( b == null ) current.next = a;

        return node.next;
    }
}
