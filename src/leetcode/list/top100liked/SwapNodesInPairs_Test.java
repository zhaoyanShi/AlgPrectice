package leetcode.list.top100liked;

import static leetcode.list.top100liked.ListNodeUtil.*;

public class SwapNodesInPairs_Test {
    public static void main(String[] args) {
        SwapNodesInPairs object = new SwapNodesInPairs();

        ListNode listNode = object.swapPairs(buildList(new int[]{1, 2, 3, 4}));
        System.out.println(formatToString(listNode));
        System.out.println("expected: [2,1,4,3]");

    }
}
