// interface Bycycle{
//     int a = 45;
//     void ApplyBreak(int decreament);
//     void SpeedUp(int increament);
// }
// interface MeriBycycle{
   
//     void HormMhn();
//     void HornKkkg();
// }
// class cycle implements Bycycle, MeriBycycle{
//     void BloomHorn(){
//         System.out.println("Pee Pee Poo Poo");
//     }
//     public void ApplyBreak(int decreament){
//         System.out.println("Apply Break!");
//     }
//     public void SpeedUp(int increament){
//         System.out.println("Increase Speed!");
//     }
//     public void HormMhn(){
//         System.out.println("Mai hoan na! Pee Pee");
//     }
//     public void HornKkkg(){
//         System.out.println("Kabhi khushi kabhi gam Poo Poo");
//     }
// }
// public class InnerinterFace {
// @SuppressWarnings("static-access")
// public static void main(String[] args) {
//     cycle sc = new cycle();
//     sc.ApplyBreak(5);
//     sc.SpeedUp(5);
//     sc.BloomHorn();
//     System.out.println(sc.a);
//     sc.HormMhn();
//     sc.HornKkkg();
// }
    
// }

interface papa{
    void Angry();
    void happy();
    default void sad(){
    System.out.println("Are you Sad");
    }
}
interface mummi{
    void hungry();
   String[] name();
}
class Brother{
    void sleep(){
        System.out.println("How Sleepy you are!");
    }
    public String name3;
    String name2(){
        return name3;
    }
}
class Me extends Brother implements papa, mummi{
    public void Angry(){
        System.out.println("How Angry you are");
    }
    public void happy(){
        System.out.println("How Happy you are");
    }
    public void hungry(){
        System.out.println("how hungry you are");
    }
   public String[] name(){
     String[] nameList = {"Damini","Dimple","Diya"};
     return nameList;
   }
}
public class InnerinterFace {
public static void main(String[] args) {
    Brother sc = new Brother();
    sc.sleep();
    sc.name2();
    Me p = new Me();
    p.Angry();
    p.happy();
    p.hungry();
    p.sad();
    String[] arr = p.name();
    for (String i  : arr) {
        System.out.println(i);
    }
}
    
}