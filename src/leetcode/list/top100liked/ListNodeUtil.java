package leetcode.list.top100liked;

public class ListNodeUtil {
    public static ListNode buildList(int[] values) {
        ListNode dummy = new ListNode(-1, null);
        ListNode node = dummy;
        for (int value : values) {
            node.next = new ListNode(value);
            node = node.next;
        }
        return dummy.next;
    }

    public static String formatToString(ListNode node) {
        StringBuilder sb = new StringBuilder();
        while (node != null) {
            sb.append(node.val);
            sb.append(",");
            node = node.next;
        }
        return "[" + sb.toString().substring(0, sb.length()-1) + "]";
    }
}
