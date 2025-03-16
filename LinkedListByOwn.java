public class LinkedListByOwn {
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
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
       newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
         head = tail = newNode;
            return;
        }
       tail.next = newNode;
       tail = newNode;
    }

    public void print(){
        if(head == null){
          System.out.println("LL is empty");
          return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx-1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int ItrSearch(int key){
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if(temp.data == key){ // Key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // Key not found
        return -1;
    }

    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void Reverse(){
     Node prev = null;
     Node curr = tail = head;
     Node next;
     while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        
     }
     head = prev;
    }

    public void deletNthFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next;  // remove first
            return;
        }
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
            
        }
        prev.next = prev.next.next;
        return;
    }

    // slow - fast aproch
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) { // fast = null for Even
            slow = slow.next;   //+1                // fast.next = null for Odd
            fast = fast.next.next;  //+2

        }
        return slow;   // slow is midNode
    }
    public boolean checkPalindrom(){
        if(head == null || head.next == null){
            return true;
        }
        // step 01 find mid
        Node miNode = findMid(head);

        // step 02 reverse 2nd half
        Node prev = null;
        Node curr = miNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step 03 cheak left and right half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
public static void main(String[] args) {
    LinkedListByOwn l1 = new LinkedListByOwn();
     
     l1.addFirst(2);
     l1.addFirst(1);
     l1.addLast(4);
     l1.addLast(5);
     l1.add(2, 3);
    // l1.removeFirst();
     l1.print();
    //  l1.Reverse();
    //  l1.print();
     l1.deletNthFromEnd(2);
     l1.print();
     System.out.println(l1.checkPalindrom());
    // System.out.println(l1.size);
    // System.out.println(l1.ItrSearch(2));
    // System.out.println(l1.ItrSearch(10));
    // System.out.println(l1.recSearch(2));
    // System.out.println(l1.recSearch(10));
}
    
}