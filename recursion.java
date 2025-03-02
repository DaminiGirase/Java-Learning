public class recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
        static int factorial_iterative(int n){
            if(n==0 || n==1){
                return 1;
            }
            else{
                int product = 1;
                for(int i=1; i<=n; i++){
                    product*=i;
                }
                return product;
            }
        }
  
    public static void main(String[] args) {
        int n = 4;
       int c = factorial(n);
       int d = factorial_iterative(n);
       System.out.println("factoral of n is "+ c);
        System.out.println("Factoral using recursion is "+ d);
    }
}
