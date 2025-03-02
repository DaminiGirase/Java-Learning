
class Base{
    public Base(){
        
    System.out.println("I am base Class Constructor"); 
}
    @SuppressWarnings("unused")
    private int a;
    public Base(int a){
        this.a = a;
    System.out.println("I am Overloaded base Class Constructor with value of a is: "+a); 
}
}
 class Derived1 extends Base{
   public Derived1(){
    super(5);
        System.out.println("I am Derived class constructor");
    }
}


public class heritance {
    public static void main(String[] args) {
     @SuppressWarnings("unused")
    Base sc = new Base();
    @SuppressWarnings("unused")
    Derived1 c = new Derived1();
    }
}
