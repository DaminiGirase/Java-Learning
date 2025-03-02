
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nuber whose factorial to be calculate");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
           fact *= i;
           
        }
        System.out.println(fact);
    }
}
