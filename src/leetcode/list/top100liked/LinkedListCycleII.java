package leetcode.list.top100liked;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/linked-list-cycle-ii
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while(node != null) {
            if(set.contains(node))
                return node;

            set.add(node);
            node = node.next;
        }

        return null;
    }
}
