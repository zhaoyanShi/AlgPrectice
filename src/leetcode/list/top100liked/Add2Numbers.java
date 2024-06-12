package leetcode.list.top100liked;

//https://leetcode.cn/problems/add-two-numbers/description/?envType=study-plan-v2&envId=top-100-liked
public class Add2Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode head = new ListNode();
        ListNode newList = head;
        while(l1 != null || l2 != null || carry > 0) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            int value = val1 + val2 + carry;
            carry = 0;
            if(value >= 10) {
                value -= 10;
                carry = 1;
            }
            head.next = new ListNode(value);
            head = head.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        return newList.next;
    }
}
