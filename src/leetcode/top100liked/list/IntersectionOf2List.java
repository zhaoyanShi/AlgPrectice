package leetcode.top100liked.list;

//https://leetcode.cn/problems/merge-two-sorted-lists/?envType=study-plan-v2&envId=top-100-liked
public class IntersectionOf2List {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while(a != b) {
            if(a != null) a = a.next;
            else a = headB;

            if(b!= null) b = b.next;
            else b = headA;
        }
        return a;
    }
}
