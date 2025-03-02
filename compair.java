import java.util.Scanner;

public class compair {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("comparing two oprands");
        int b = 34;
        int a = sc.nextInt();
        System.out.println(a>b);

    }
}
