class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }
        
        tail.next = head;
        k %= len;
        
        for (int i = 0; i < len - k; i++) {
            tail = tail.next;
        }
        
        head = tail.next;
        tail.next = null;
        
        return head;
    }
}