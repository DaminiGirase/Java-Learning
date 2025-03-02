import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        System.out.println("program to check you are experanced or not");
        System.out.println("enter your experanced");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=56){
            System.out.println("you are experanced");
        }
        else if(age>=40){
            System.out.println("you have less experanc");
        }
        else{
            System.out.println("you are not experanced");
        }

    }
}
