import java.util.Scanner;
public class days {
   public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    System.out.println("program to days of week");
    System.out.println("enter the number of day");
    int days = sc.nextInt();
    switch (days) {
        // case 1: System.out.println("Monday");
        // break;
        // case 2: System.out.println("Tuesday");
        // break;
        // case 3: System.out.println("Wednesday");
        // break;
        // case 4: System.out.println("thuseday");
        // break;
        // case 5: System.out.println("friday");
        // break;
        // case 6: System.out.println("saturday");
        // break;
        // case 7: System.out.println("sunday");
        // break;
        // default: System.out.println("invalid day");
        // break;
        
        //Another method of switch
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        
    }
   } 
}
