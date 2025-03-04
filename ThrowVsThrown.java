class NegitiveRadiusException extends Exception{
    @Override
    public String toString() {  
        return "Radius cannot be negative!";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class ThrowVsThrown {
    public static double area(int r) throws NegitiveRadiusException{
        if(r<0){
            throw new NegitiveRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int Divide(int a, int b) throws ArithmeticException{
       int result = a/b;
       return result;
    }
    public static void main(String[] args) {
        try{
        //    int c = Divide(3,0);
        //    System.out.println(c);
           double sc = area(7);
           System.out.println(sc);
        }
        catch(Exception e){
            System.out.println("Exception");

            
        }
    }
}
