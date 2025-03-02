public class displayArr {
    public static void main(String[] args) {
        System.out.println("Program to print array");
        int [] marks = {98, 87, 90, 97, 99};
        // for(int i=0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }

        // For Each Loop
        for(int element: marks){
            System.out.println(element);
        }
    }
}
