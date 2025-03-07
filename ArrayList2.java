
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args) {
      ArrayList<Integer> l1 = new ArrayList<>();
     ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(9);
        l2.add(23);
        l2.add(34);
        l2.add(12);
        l1.addAll(l2);
        l1.add(0,6);
        l1.add(0,9);
        System.out.println(l1.contains(45));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(6));
        l1.set(1,342);
        l1.remove(3);
        l1.addLast(98);
        l1.addFirst(11);
       // l1.clear(); --> for cleaar the elements

        for(int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
