// 01 

// import java.util.ArrayList;

// public class Multi_DiamentonalArrayList {
//    public static void main(String[] args) {
//    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//    ArrayList<Integer> list = new ArrayList<>();
//    list.add(2); list.add(3);
//    mainList.add(list);

//    ArrayList<Integer> list2 = new ArrayList<>();
//    list2.add(7);
//    list2.add(9);
//    mainList.add(list2);

//    for(int i=0; i<mainList.size(); i++){
//     ArrayList<Integer> currentList = mainList.get(i);
//     for(int j=0; j<currentList.size(); j++){
//         System.out.print(currentList.get(j) + " ");
//     }
//     System.out.println();
//    }

//    } 
// }

// 02

import java.util.ArrayList;

public class Multi_DiamentonalArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

       for(int i=0; i<mainList.size();i++){
        ArrayList<Integer> currentList = mainList.get(i);
        for(int k=0; k<currentList.size(); k++){
            System.out.print(currentList.get(k)+" ");
        }
        System.out.println();
       }
        


    }
}