package Leetcode.Medium.LinkedList;

public class detectCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slowPoint = head;
        ListNode fastPoint = head;
        while(slowPoint != null && fastPoint != null && fastPoint.next != null){
            slowPoint = slowPoint.next;
            fastPoint = fastPoint.next.next;

            if(slowPoint == fastPoint){
                slowPoint = head;

                while(slowPoint!=fastPoint){
                    slowPoint = slowPoint.next;
                    fastPoint = fastPoint.next;
                }
                return slowPoint;
            }
        }
        return null;
    }
}
