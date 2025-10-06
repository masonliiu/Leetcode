class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head;
        ListNode storage = null;

        for( int i = 0; i < k; i++) {
            storage = first;
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        int temp = storage.val;
        storage.val = second.val;
        second.val = temp;

        return head;
    }
}