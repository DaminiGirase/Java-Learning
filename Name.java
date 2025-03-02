import java.util.Scanner;
public class Name {
    public static void main(String[] args){
    System.out.println("print the massage");
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    System.out.println("Hello " + str + " have a good day");
}
}
