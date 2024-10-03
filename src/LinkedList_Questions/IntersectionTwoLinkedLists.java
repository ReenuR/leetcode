package LinkedList_Questions;

import java.util.HashMap;
import java.util.Map;

public class IntersectionTwoLinkedLists {
    public static void main(String[] args) {
        System.out.println();
    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectVal = new ListNode(0);
        Map<ListNode, Integer> map = new HashMap<>();

        ListNode list1 = headA;
        ListNode list2 = headB;

        while(list1 != null && list2 != null){
            if(map.containsKey(list1))
                return list1;
            else
                map.put(list1, list1.val);
            if(map.containsKey(list2))
                return list2;
            else
                map.put(list2, list2.val);
            list1 = list1.next;
            list2 = list2.next;

        }

        return null;

    }
}
