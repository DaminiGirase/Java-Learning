import java.util.Scanner;
public class integer {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Check wheather the entered integer or not");
        System.out.println(sc.hasNextInt());
    }
}     