package Problem2;

// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        // homework
        SingleLinkedList copy = list;

        if(list == null){
            this.head = null;
        }
        this.head = copy.head;
        this.size = copy.size;
        ListNode dummy = this.head;
        while(copy.head.next != null){
            this.head.next = copy.head.next;
            copy.head.next = copy.head.next.next;
        }
        this.head = dummy;
    }

    public int removeAll(int valueToRemove) {
        // homework
        int replaced = 0;
        ListNode dummy;
        while(this.head.val == valueToRemove){
            this.head = this.head.next;
        }
        dummy = this.head;
        while(this.head.next != null) {
            if(this.head.next.val == valueToRemove && this.head.next.next == null) {
                this.head.next = null;
                replaced++;
                size--;
            }else if (this.head.next.val == valueToRemove) {
                this.head.next = this.head.next.next;
                replaced++;
                size--;
            }else{
                this.head = this.head.next;
            }
        }
        this.head = dummy;
        // in-place
        return replaced; // place holder
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        // homework
        ListNode current = this.head;
        ListNode prev = current;
        ListNode next;
        if(this.head == null || this.head.next == null){

        }else {
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            this.head = prev;
            // in-place
        }
    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
