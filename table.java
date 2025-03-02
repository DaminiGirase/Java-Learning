import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table you want print");
        int n = sc.nextInt();
        // for(int i=1; i<=10; i++){
        //     System.out.println(n*i);

        // in rever order

        // for(int i=10; i>=1; i--){
        //     System.out.println(n*i);

         //sum of table numbers
         int sum = 0;
         for(int i=1; i<=10; i++){
           sum += n*i;
        }
        System.out.println(sum);
        
    }
}
