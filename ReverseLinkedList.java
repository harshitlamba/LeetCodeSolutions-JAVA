class Node {
    int val;
    Node next;
    
    Node(int val) { this.val = val; }
}

class LinkedL {
    private Node head;

    public LinkedL() {
        this.head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node newHead) {
        this.head = newHead;
    }

    public void addVal(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node itr = head;
            while (itr.next!=null) {
                itr = itr.next;
            }
            itr.next = newNode;
        }
    }

    public Node reverseListRec(Node head) {
        if ((head == null) || (head.next == null)) {
            return head;
        }
        Node prev = head.next;
        Node newHead = reverseListRec(head.next);
        prev.next = head;
        head.next = null;
        return newHead;
    }

    public Node reverseList(Node head) {
        if (head == null) {
            return head;
        }
        Node prev = null; Node tmp;
        Node curr = head;
        while (curr != null) {
            tmp = curr;
            curr = curr.next;
            tmp.next = prev;
            prev = tmp;
        }
        return prev;
    }

    public void print(Node head) {
        Node itr = head;
        while (itr != null) {
            System.out.println(itr.val);
            itr = itr.next;
        }
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedL linkedL = new LinkedL();
        linkedL.addVal(1);
        linkedL.addVal(2);
        linkedL.addVal(3);
        linkedL.print(linkedL.getHead());
//        linkedL.setHead(linkedL.reverseList(linkedL.getHead()));
        linkedL.setHead(linkedL.reverseListRec(linkedL.getHead()));
        linkedL.print(linkedL.getHead());
    }
}
