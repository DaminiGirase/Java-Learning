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
public static void main(String[] args) {
    LinkedListByOwn l1 = new LinkedListByOwn();
     
     l1.addFirst(2);
     l1.addFirst(1);
     l1.addLast(4);
     l1.addLast(5);
     l1.add(2, 3);
     l1.removeFirst();
     l1.print();
    System.out.println(l1.size);
    System.out.println(l1.ItrSearch(3));
    System.out.println(l1.ItrSearch(10));
}
    
}