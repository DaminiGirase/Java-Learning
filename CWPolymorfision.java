class Animal3{
    public void AnimalSound(){
        System.out.println("Animals makes an differant sound");
    }
}
class pig extends Animal3{
    public void AnimalSound(){
        System.out.println("Pigs sounds: Wee Wee");
    }
}
class dog extends Animal3{
    public void AnimalSound(){
        System.out.println("Dogs sounds:Boo Boo");
    }
}
public class CWPolymorfision {
    public static void main(String[] args) {
        // Animal3 sc = new Animal3();
        // sc.AnimalSound();
        // pig cs = new pig();
        // cs.AnimalSound();
        // dog d = new dog();
        // d.AnimalSound();
        Animal3 MyAnimal = new Animal3();
        Animal3 MyPig = new pig();
        Animal3 MyDog = new dog();
        MyAnimal.AnimalSound();
        MyPig.AnimalSound();
        MyDog.AnimalSound();
    }
}
