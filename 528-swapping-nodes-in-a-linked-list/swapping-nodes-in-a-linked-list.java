/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head;
        ListNode storage = head;

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
        // int counter = 0;
        // ListNode curr = head;
        // if (head == null || head.next == null) {
        //     return head;
        // }

        // while (curr != null) {
        //     curr = curr.next;
        //     counter++;
        // }
        // curr = head;

        // for ( int i = 0; i < k-1; i++) {
        //     curr = curr.next;
        // }
        // ListNode firstK = curr;
        // curr = head;

        // for (int i = 1; i < counter - k + 1; i++) {
        //     curr = curr.next;
        // }
        // int temp = curr.val;
        // curr.val = firstK.val;
        // firstK.val = temp;
        // return head;


    }
}