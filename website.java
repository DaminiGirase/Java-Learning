import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.println("program to find type of website");
        System.out.println("Enter the website");
        String str = sc.nextLine();
        if(str.endsWith(".com")){
            System.out.println("Commertial Website");
        }
        else if(str.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if(str.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Other website");
        }
    }
}
