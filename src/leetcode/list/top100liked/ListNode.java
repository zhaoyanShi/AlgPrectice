package leetcode.list.top100liked;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int x) {
        val = x;
        next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }
}
