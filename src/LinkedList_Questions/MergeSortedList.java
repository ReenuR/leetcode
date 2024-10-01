package LinkedList_Questions;

public class MergeSortedList {

    public static void main(String[] args) {

        // Create the first example ListNode instances
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        // Call mergeTwoLists method and print the result
        ListNode result = mergeTwoLists(list1, list2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3 = null;


        ListNode l1_Current = l1;
        ListNode l2_Current = l2;

        ListNode dummyNode = new ListNode(-1);
        l3 = dummyNode;


        while(l1_Current != null && l2_Current != null){
            if(l1_Current.val < l2_Current.val){
                dummyNode.next = l1_Current;
                l1_Current = l1_Current.next;

            }else{
                dummyNode.next = l2_Current;
                l2_Current = l2_Current.next;
            }
            dummyNode = dummyNode.next;

        }
        if(l1_Current != null)
            dummyNode.next = l1_Current;

        if(l2_Current != null)
            dummyNode.next = l2_Current;

        return l3.next;
    }

}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
