import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("program to find whether the entered year leap or not");
        System.out.println("Enter the the year");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("The year is leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}
