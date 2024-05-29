package leetcode.top100liked.list;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arrayList = new ArrayList();

        ListNode node = head;
        while(node != null) {
            arrayList.add(node.val);
            node = node.next;
        }

        int end = arrayList.size() - 1;
        int start = 0;
        while (start <= end) {
            if(!arrayList.get(start).equals(arrayList.get(end))) {
                return false;
            }
            start ++;
            end --;
        }

        return true;
    }
}
