package LinkedList_Questions;

public class DoublyLLPalindrome {
    public static void main(String[] args) {
        DLNode head1 = new DLNode(1);
        head1.next = new DLNode(2);
        head1.next.prev = head1;
        head1.next.next = new DLNode(2);
        head1.next.next.prev = head1.next;
        head1.next.next.next = new DLNode(1);
        head1.next.next.next.prev = head1.next.next;
        System.out.println(isPalindrome(head1));
    }
    public static boolean isPalindrome(DLNode head) {

        if(head== null)
            return true;

        DLNode start = head;
        DLNode end;
        while(head.next != null)
        {
            head = head.next;
        }
        end = head;

        while(start != end && start.prev != end){

            if(start.val != end.val)
                return false;
            else{
                start = start.next;
                end = end.prev;
            }
        }

        return true;
    }
}
class DLNode {
     int val;
     DLNode next, prev;
     DLNode(int val) { this.val = val; }
 }

