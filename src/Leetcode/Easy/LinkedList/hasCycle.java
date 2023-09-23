package Leetcode.Easy.LinkedList;

public class hasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(slowPtr!= null && fastPtr!= null && fastPtr.next != null ){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                return true;
            }
        }
        return false;
    }
}
