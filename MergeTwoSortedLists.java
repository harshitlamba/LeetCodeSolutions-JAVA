class ListNode {
    int value;
    ListNode next;

    ListNode() {}
    ListNode(int value) {
        this.value = value;
    }
}

class LinkedList {
    ListNode head;

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void add(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            ListNode itr = head;
            while (itr.next != null) {
                itr = itr.next;
            }
            itr.next = newNode;
        }
    }

    public void addAll(int[] values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    public void printList(ListNode newHead) {
        ListNode itr = newHead;
        while (itr != null) {
            System.out.println(itr.value);
            itr = itr.next;
        }
    }
}

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if ((list1 == null) & (list2 == null)) {
            return null;
        }
        ListNode resultHead = new ListNode();
        ListNode prev = resultHead;
        while ((list1 != null) & (list2 != null)) {
            if (list1.value <= list2.value) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if (list1 == null) {
            prev.next = list2;
        } else {
            prev.next = list1;
        }
        return resultHead.next;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        LinkedList sortedList = new LinkedList();

        list1.addAll(new int[]{1,2,4});
        list2.addAll(new int[]{1,3,4,5});
        ListNode result = mergeTwoSortedLists.mergeTwoLists(list1.getHead(), list2.getHead());
        sortedList.setHead(result);
        sortedList.printList(sortedList.getHead());
    }
}
