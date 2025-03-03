
import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString";
    }
    @Override
    public String getMessage() {
        return "I am getMassage";
    }
}
public class Exception_Class {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = sc.nextInt();
        System.out.println("Enter number B: ");
        int b = sc.nextInt();
        if(a<9){
        try{
            if(b==0){
                //  throw new MyException();
                throw new ArithmeticException("Arithmatic Exception occure");
            }
            else{
                System.out.println("Division is: " + a/b);
            }
       
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("Finish code");
        }
    }
}

}
