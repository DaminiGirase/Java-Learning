class Modifiers{
    public int a = 23;
    protected int b = 45;
    int c = 56;
    private int d = 67;
    void meth1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        // we can use all 4 Modifier in same class
    }
}

public class ExcesModifier {
    public static void main(String[] args) {
        Modifiers sc = new Modifiers();
        //sc.meth1();
        System.out.println(sc.a);
        System.out.println(sc.b);
        System.out.println(sc.c);
       // System.out.println(sc.d); --> we can not use private Modifier in same package
      // In subclass we only exeses public and protected
      // in world we only exces public  

    }
}
