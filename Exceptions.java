import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        
        // 1 Arithmatic Exceptions

        // int a = 200;
        // int b = 0;

        // Withuot Try

        // int c = a/b;
        // System.out.println("The Result is: " + c);

        // With Try

    //     try{
    //         int c = a/b;
    //      System.out.println("The Result is: " + c);
    //     }
    //     catch(Exception e){
    //         System.out.println("We failed to Execute the program!. Reason: ");
    //         System.out.println(e);
    //     }
    //     System.out.println("End of the program");
    // }

    // 2 ArrayIndexBoundOfException Exceptoin

    int [] number = new int [3];
    number[0] = 23;
    number[1] = 45;
    number[2] = 30;
    System.out.println("Enter the array index: ");
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   System.out.println("Enter a number you want divide with");
   int num = sc.nextInt();
   try{
    System.out.println("The value of array number entered is: " + number[n]);
    System.out.println("The value which divide with: " + number[n]/num);
   }
   catch(ArithmeticException e){
    System.out.println("ArithmeticException Occured!");
    System.out.println(e);
   }
   catch(ArrayIndexOutOfBoundsException e){
    System.out.println("ArrayIndexOutOfBoundsException Occured!");
    System.out.println(e);
   }
   catch(Exception e){
    System.out.println("Some other Exception Occured!");
    System.out.println(e);
   }

}
}