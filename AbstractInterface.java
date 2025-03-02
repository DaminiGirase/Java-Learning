// Practice Problem 01

// abstract class pen{
//     abstract public void Write();
//     abstract public void Refill();
// }
// class pencil extends pen{
//     public void Write(){
//         System.out.println("Kutha to likha gadhi");
//     }
//     public void Refill(){
//         System.out.println("Gadhi pen khatam ho gaya refill dhe");
//     }
//     void ChangeNib(){
//         System.out.println("Change The nib");
//     }
// }
// public class AbstractInterface {
//     public static void main(String[] args) {
//         pencil sc = new pencil();
//         sc.Write();
//         sc.Refill();
//         sc.ChangeNib();
//     }
// }

// practice problem 02

// class Monkey{
//     void Jump(){
//         System.out.println("Jumping...");
//     }
//     void Bite(){
//         System.out.println("Biting...");
//     }
// }
// interface BasicAnimal{
//     void Eat();
//     void Sleep();
// }
// class Humam extends Monkey implements BasicAnimal{
//     public void Eat(){
//         System.out.println("Eatting...");
//     }
//     public void Sleep(){
//         System.out.println("Sleepy...");
//     }
// }
// public class AbstractInterface {
// public static void main(String[] args) {
//     Monkey sc = new Monkey();
//     sc.Jump();
//     sc.Bite();
//     Humam h = new Humam();
//     h.Eat();
//     h.Sleep();
// }
// }

// Practice Problem 03

// abstract class TeliPhone{
//     abstract public void ring();
//     abstract public void lift();
//     abstract public void disconect();
// }
// class SmartTeliphone extends TeliPhone{
//     public void ring(){
//         System.out.println("Phone is Ringing");
//     }
//     public void lift(){
//         System.out.println("Phone is Lifting");
//     }
//     public void disconect(){
//         System.out.println("Phone is Disconect");
//     }
// }
// public class AbstractInterface {
// public static void main(String[] args) {
//     TeliPhone sc = new SmartTeliphone();
//     sc.ring();
//     sc.lift();
//     sc.disconect();
// }
// }

// Practice Problem 04

interface TvRemote{
  void switchOn();
}
interface SmartTvRemote extends TvRemote{
    void switchOnTv();
}
class New implements SmartTvRemote{
    public void switchOn(){
        System.out.println("Switch on genral tv");
    }
    public void switchOnTv(){
        System.out.println("Switch on Smart tv");
    }
}
public class AbstractInterface {
public static void main(String[] args) {
    New sc = new New();
    sc.switchOn();
    sc.switchOnTv();
}
}