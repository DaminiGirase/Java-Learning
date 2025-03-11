public class LinkedListApna {
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

public void addFirst(int data){
     // step 1 = creat new node
     Node newNoded = new Node(data);
    if(head == null){
       head = tail = newNoded;
       return;
    }
   
    // step 2 = newnode next = head
    newNoded.next = head;

    // step 3 = head = newnode
    head = newNoded;
}
public void addLast(int data){
    Node newnNode = new Node(data);
    if(head == null){
        head = tail = newnNode;
        return;
    }
    tail.next = newnNode;
    tail = newnNode;
}

public void print(){
    if(head == null){
        System.out.println("LL is empty");
        return;
    }
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " -->");
        temp = temp.next;
    }
    System.out.println("null");
}
public static void main(String[] args) {
    LinkedListApna l1 = new LinkedListApna();
    l1.print();
    l1.addFirst(2);
    l1.print();
    l1.addFirst(1);
    l1.print();
    l1.addLast(3);
    l1.print();
    l1.addLast(4);
    l1.print();
}
}
