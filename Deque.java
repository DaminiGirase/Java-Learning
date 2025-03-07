import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> sc = new ArrayDeque<>();
        sc.add(3);
        sc.add(9);
        sc.add(2);
        sc.addFirst(23);
        sc.addLast(56);
        sc.contains(9);
    //     System.out.println(sc.isEmpty());
    // System.out.println(sc.iterator());
    // System.out.println(sc.offer(9));
    // System.out.println(sc.offerFirst(3));
    // System.out.println(sc.offerLast(67));
    //System.out.println(sc.peek());
   // System.out.println(sc.poll());
   
   //System.out.println(sc.pop());
       System.out.println(sc.clone()); 

    //    System.out.println(sc.element());
    //     System.out.println(sc.getFirst());
    //     System.out.println(sc.getLast());
    
    }
}
