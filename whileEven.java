import java.util.Scanner;
public class whileEven {
    public static void main(String[] args) {
      @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
      int n = sc.nextInt();
      int i = 0;
      while(i<=n){
        if(i%2==0){
            System.out.println(i);
        }
        i++;
      }  
    }
}
