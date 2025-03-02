public class variableArgument {
    
    static int sum(int ...arr){
        int result = 0;
        for(int element: arr){
            result += element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("program to print sum using variable arguments");
        System.out.println("The sum of 3 and 5 is " + sum(3, 5));
        System.out.println("The sum of 2 and 5 and 6 is " + sum(2, 5, 6));
        System.out.println("The sum of 6, 7, 9, and 8 is " + sum(6, 7, 9, 8));
    }
    
}
