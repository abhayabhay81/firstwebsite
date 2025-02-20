public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        if (head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        size++;
        if (head == null){
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void addMiddle(int idx,int data){
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public void print(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst(){
        if (size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = head.next;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if (size == 0){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prew = head;
        for (int i = 0; i < size-2; i++) {
            prew = prew.next;
        }
        int val = prew.next.data;
        prew.next = null;
        tail = prew;
        size--;
        return val;
    }
    public int Itr_Search(int key){
        Node temp = head;
        int i = 0;

        while (temp != null){
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;  // key not found
    }

    public int helper(Node head,int key){
        if (head == null){
            return -1;
        }
        if (head.data == key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int rec_Search(int key){
        return helper(head,key);
    }

    public void reverce(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void Remove_n_th_node_from_end(int n){
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }
        if (n == sz){
            head = head.next;
            return;
        }
        int i =1;
        int itoFind =sz-n;
        Node prev = head;
        while (i < itoFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findmid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean check_Palindrome(){
        if (head == null || head.next == null){
            return true;
        }
        // step 1-find mid
        Node midnode = findmid(head);
        Node prev = null;
        Node curr = midnode;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean detect_Loop_or_Cycle(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void remove_cycle_in_list(){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow){
                cycle = true;
                break;
            }
        }
        if (cycle == false){
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergetll = new Node(-1);
        Node temp = mergetll;

        while (head1 != null && head2 != null){
            if (head1.data <= head2.data){
                temp.next = head1.next;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergetll.next;
    }
    public Node mergeshot(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeshot(head);
        Node newRight = mergeshot(rightHead);
        return merge(newLeft,newRight);
    }
    public void ZicZac(){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextl ,nextr;

        while (left != null && right != null){
            nextl = left.next;
            left.next = right;
            nextr = right.next;
            right.next = nextl;

            left = nextl;
            right = nextr;
        }
    }
    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.addFirst(11);
//        ll.addFirst(12);
//        ll.addFirst(13);
//        ll.addFirst(12);
//        ll.addFirst(10);
//        ll.print();

//        System.out.println(ll.check_Palindrome());
//        ll.print();
//        System.out.print("size of linked list: "+size);
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.rec_Search(99));
//        ll.reverce();
//        ll.print();

//        // cycle procss
//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        System.out.println(detect_Loop_or_Cycle());
//        remove_cycle_in_list();
//        System.out.println(detect_Loop_or_Cycle());

        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.ZicZac();
        ll.print();
    }
}
