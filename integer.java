import java.util.Scanner;
public class integer {
    public integer(int i) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Check wheather the entered integer or not");
        System.out.println(sc.hasNextInt());
    }

    public static integer valueOf(int a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valueOf'");
    }

    public int intValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'intValue'");
    }
}     