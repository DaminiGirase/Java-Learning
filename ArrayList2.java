
import java.util.*;
public class ArrayList2 {
    // public static void swap(ArrayList<Integer> l1, int idx1, int idx2){
    //     int temp = l1.get(idx1);
    //     l1.set(idx1, l1.get(idx2));
    //     l1.set(idx2, temp);
        
    // }
    public static void main(String[] args) {
    

        // size is dynamic not fix
        // primitive data type can't be stored directly eg. int
        // <Integer> it is a class  <> show type of data

      ArrayList<Integer> l1 = new ArrayList<>();
     //ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l1.add(4);
        l1.add(7);
        l1.add(8);
        l1.add(9);

        // 04 Sorting Array List 

        //  collections is = class
        //  collection is = interface
        // sort in asending order

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);

        // Decending 
        
         Collections.sort(l1, Collections.reverseOrder());
         System.out.println(l1);

         // 03 Swapping Array List

       // int idx1 = 1;
        // int idx2 = 3;
        // System.out.println(l1);
        // swap(l1, idx1, idx2);
        // System.out.println(l1);


        // l2.add(23);
        // l2.add(34);
        // l2.add(12);
        // l1.addAll(l2);
        // l1.add(0,6);
        // l1.add(0,9);
        // System.out.println(l1.contains(45));
        // System.out.println(l1.indexOf(4));
        // System.out.println(l1.lastIndexOf(6));
        // l1.set(1,342);
        // l1.remove(3);
        // l1.addLast(98);
        // l1.addFirst(11);
       // l1.clear(); --> for cleaar the elements

       // 01 print and find max in aaray list

        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<l1.size(); i++){
        //     System.out.print(l1.get(i));
        //     System.out.print(", ");
        //  if(l1.get(i) > max){
        //     max = l1.get(i);
        //  }
        // max = Math.max(max, l1.get(i));
       // }
        // System.out.println("Max element is: "+max);

         // 02 reverse arrayList

        // for(int i = l1.size()-1; i>=0; i--){
        //     System.out.print(l1.get(i));
        //         System.out.print(", ");
        // }

        // swapp ArrayList


    }
}
