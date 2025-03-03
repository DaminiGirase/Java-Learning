abstract class Animal {
public void label(){
    System.out.println("Animals Data");
}
abstract public void move();
abstract public void eat();
}
class birds extends Animal{
    public void move(){
        System.out.println("Flaying in the sky");
    }
    public void eat(){
        System.out.println("Bird Food");
    }
}
class fish extends Animal{
    public void move(){
        System.out.println("Swimming in the river");
    }
    public void eat(){
        System.out.println("Water Food");
    }
}
public class CWAbstarction {
    public static void main(String[] args) {
       birds sc = new birds();
        sc.label();
        sc.move();
        sc.eat();
        fish cs = new fish();
        cs.label();
        cs.move();
        cs.eat();
    }
}
