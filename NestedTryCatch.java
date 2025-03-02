import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 45;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the array index: ");
            int num = sc.nextInt();
      try{
        System.out.println("Welcome Two program");
        try{
            System.out.println(marks[num]);
        flag = false;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sorry the index does not excist");
            System.out.println("Exception in level 2");
        }
      }
      catch(Exception e){
        System.out.println("Exception in level 1");
      }
    }
    System.out.println("Program Ends");
 }
}
