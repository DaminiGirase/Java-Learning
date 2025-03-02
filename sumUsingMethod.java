public class sumUsingMethod {
    static int sum(int a, int b){
        return a+b;
    }
   
    public static void main(String[] args) {
        System.out.println("Program to print sum using method");
        int x = 6;
        int y = 9;
        int c = sum(x,y);
        System.out.println("The sum is " + c);
    }   
}
