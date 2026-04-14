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
    public ListNode partition(ListNode head, int x) {
        ListNode smallHead = new ListNode(0);
        ListNode highHead = new ListNode(0);
        
        ListNode small = smallHead;
        ListNode high = highHead;
        
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                high.next = head;
                high = high.next;
            }
            head = head.next;
        }
        
        high.next = null;
        small.next = highHead.next;
        
        return smallHead.next;
    }
}