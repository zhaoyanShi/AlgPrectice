package leetcode.list.top100liked;


import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-100-liked
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while(node != null) {
            if(set.contains(node))
                return true;

            set.add(node);
            node = node.next;
        }

        return false;
    }
}
