class a{
    public int method1(){
        System.out.println("I am mathode 1 of class A");
        return 4;
    }
    // methode overiding
    public void methode2(){
        System.out.println("I am methode 2 of class A");
    }
}
    // methode overiding

    class b extends a{
        public void methode2(){
            System.out.println("I am methode 2 of class B");
        }
        public void methode3(){
            System.out.println("I am methode 3 of class B");
        }
    }


public class overiding {
    public static void main(String[] args) {
        a s = new a();
        s.methode2();
        b q = new b();
        q.methode2();
        q.methode3();

        // Dynamic Methode Dispatch
        a r = new b();
        r.methode2();
       
    }
}
