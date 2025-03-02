import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = sc.nextInt();
       for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.printf("* ");
        }
        System.out.printf("\n");
       }
    }
}
