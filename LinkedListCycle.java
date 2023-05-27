import java.util.HashSet;

public class LinkedListCycle {
//    Approach 1: Using hash set - O(n) space complexity
//    public static boolean hasCycle(ListNode head) {
//        HashSet<ListNode> hashSet = new HashSet<>();
//        boolean result = false;
//        while(head != null) {
//            if (hashSet.contains(head)) {
//                result = true;
//                break;
//            }
//            hashSet.add(head);
//            head = head.next;
//        }
//        return result;
//    }

//    Approach 2: Floyd's Tortoise and Hare Algorithm - if there is a cycle, fast pointer will catch up with the slow one
    public static boolean hasCycle(ListNode head) {
        boolean result = true;
        if (head != null) {
            ListNode slow = head;
            ListNode fast = head.next;
            while (slow != fast) {
                if (fast == null || fast.next == null) {
                    result = false;
                    break;
                }
                slow = slow.next;
                fast = fast.next.next;
            }
        } else {
            result = false;
        }
        return result;
    }
}
