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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        int cnt = 0;
        while(curr != null){
             curr = curr.next;
             cnt++;
        }
        int req = cnt-n;
        curr = dummy;
        for(int i=0;i<req;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;

        return dummy.next;
        
    }
}