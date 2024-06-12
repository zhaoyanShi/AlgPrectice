package leetcode.list.top100liked;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.cn/problems/copy-list-with-random-pointer/description/?envType=study-plan-v2&envId=top-100-liked
public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {

        Node orig = head;
        Map<Node, Node> nodeMap = new HashMap<>();
        while (orig != null) {
            nodeMap.put(orig, new Node(orig.val));
            orig = orig.next;
        }

        orig = head;
        while(orig != null) {
            nodeMap.get(orig).next = nodeMap.get(orig.next);
            nodeMap.get(orig).random = nodeMap.get(orig.random);
            orig = orig.next;
        }

        return nodeMap.get(head);
    }
}
