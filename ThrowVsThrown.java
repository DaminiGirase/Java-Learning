public class ThrowVsThrown {
    public static int Divide(int a, int b) throws ArithmeticException{
       int result = a/b;
       return result;
    }
    public static void main(String[] args) {
        try{
           int c = Divide(3,0);
           System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}
