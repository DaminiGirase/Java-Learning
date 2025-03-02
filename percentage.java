import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
        System.out.println("Program to find percentage of five subjects");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of maths");
        float math = sc.nextFloat();
        System.out.println("Enter marks og c programming");
        float c_programming = sc.nextFloat();
        System.out.println("Enter marks of physics");
        float physics = sc.nextFloat();
        System.out.println("Enter marks of bee");
        float bee = sc.nextFloat();
        System.out.println("Enter marks of mechanics");
        float mechanics = sc.nextFloat();
        System.out.println("percetage value is");
        float sum = (math+c_programming+physics+bee+mechanics)/500.0f;
        float percentage = sum*100;
        System.out.println(percentage);
    }
}
