import java.util.Scanner;
public class forLopp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number");
        int n = sc.nextInt(); 
        
        for(int i=n; i!=0; i--){
            System.out.println(i);
        }
    }
}
