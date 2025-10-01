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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        String x = "";
        String y = "";

        stack1.push(l1.val);
        stack2.push(l2.val);

        while(l1.next != null) {
            stack1.push(l1.next.val);
            l1.next = l1.next.next;
        }
        while(l2.next != null) {
            stack2.push(l2.next.val);
            l2.next = l2.next.next;
        }
        while(!stack1.isEmpty()) {
            x += "" + stack1.pop();
        }
        while(!stack2.isEmpty()) {
            y += "" + stack2.pop();
        }
        BigInteger huge = new BigInteger(x);
        BigInteger huge2 = new BigInteger(y);
    
        String stor = String.valueOf(huge.add(huge2));
        System.out.println(stor);
        Stack<ListNode> fin = new Stack<>();
        for (int ii = 0; ii < stor.length(); ii++) {
            fin.push(new ListNode(Integer.valueOf(stor.substring(ii, ii+1))));
            System.out.println(fin.peek().val);
        }
        ListNode str = fin.pop();
        navigate(str, fin);
        return str;
    }
    void navigate(ListNode str, Stack<ListNode> fin) {
        while (!fin.isEmpty()) {
            if (str.next == null) {
                str.next = fin.pop();
            } else {
                navigate(str.next, fin);
            }
        }
    }
}