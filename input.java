
import java.util.Scanner;

public class input {
    public static void main(String[] args){
    System.out.println("taking input form user:");
    @SuppressWarnings("resource")
    Scanner var = new Scanner(System.in);
    System.out.println("Enter first number");
     int a = var.nextInt();
     System.out.println("Enter second number");
     int b = var.nextInt();
     int sum = a + b;
     System.out.println("The sum of a and b is");
     System.out.println(sum);
    }
}
