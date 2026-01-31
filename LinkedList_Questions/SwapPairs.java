package LinkedList_Questions;

public class SwapPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode newHead = swapPairs(head);
        // Print the list after swapping pairs.
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
    public static  ListNode swapPairs(ListNode head) {
        //check for 0 or 1 node
        if(head == null || head.next == null)
            return null;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode first = head;
        ListNode second;
        ListNode prev = dummy;


        while(first != null){
            second = first.next;
            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            first = first.next;


        }

        return dummy.next;


    }
}
