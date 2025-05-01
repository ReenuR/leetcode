package LinkedList_Questions;

public class LengthOfCycle {
    public static void main(String[] args) {
    }
    public int findCycleLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Move fast pointer two steps at a time
            slow = slow.next;      // Move slow pointer one step at a time
            if (slow == fast) // Found the cycle
                return calculateLength(slow); // Calculate the cycle length
        }
        return 0;
    }

    private int calculateLength(ListNode slow) {
        ListNode current = slow.next;
        int count = 1;
        while(current !=  slow){
            count++;
        }
        return count;
    }
}
