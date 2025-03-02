import java.util.Scanner;
public class exercise{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("progra to check pass or fail");
        System.out.println("enter your maths marks");
        int maths = sc.nextInt();
        System.out.println("Enter your mechanics marks");
        int mechanics = sc.nextInt();
        System.out.println("Enter your bee marks");
        int bee = sc.nextInt();
        float avg = (maths+mechanics+bee)/3.0f;
        if(avg>=40 && maths>=33 && mechanics>=33 && bee>=33){
           System.out.println("Congratulations! you are pass");
        }
        else{
            System.out.println("Sorry! you are fail");
        }
    }
}