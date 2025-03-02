interface SmpalMe{
    void meth1();
    void meth2();
}
interface ChildSmpalMe extends SmpalMe{
  void meth3();
  void meth4();
}
class MySample implements ChildSmpalMe{
    public void meth1(){
        System.out.println("I am Methode One");
    }
    public void meth2(){
        System.out.println("I am Methode Two");
    }
    public void meth3(){
        System.out.println("I am Methode Three");
    }
    public void meth4(){
        System.out.println("I am Methode Four");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        MySample sc = new MySample();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}


