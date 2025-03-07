import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<Integer> sc = new LinkedList<>();
        LinkedList<Integer> cs = new LinkedList<>();
        sc.add(3);
        sc.add(5);
        sc.add(5);
        sc.add(6);
        cs.add(5);
        cs.add(9);
        cs.add(2);
        cs.add(2);
        sc.addAll(cs);
        sc.set(2,4);
        sc.contains(9);
        sc.addLast(345);       // new in LinkedList                                         
         sc.addFirst(344);     // new in LinkedList  
        sc.remove(4);
        sc.set(2,67);
        sc.removeFirstOccurrence(5);
        sc.removeLastOccurrence(2);
        System.out.println(sc.size());
        for(int i=0; i<sc.size(); i++){
         System.out.print(sc.get(i));
         System.out.print(", ");
        }
      

    }
}
