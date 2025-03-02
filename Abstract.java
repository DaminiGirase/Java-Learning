// abstract class parent{
//     parent(){
//       System.out.println("I am Parent Class.");
//     }
//     public void parent2(){
//         System.out.println("I am Parent 2 Class.");
//     }
//     abstract public void greet();
//     abstract public void greet2();
// }
// class child extends parent{
//    public void greet(){
//     System.out.println("Good Morning");
//    }
//     public void greet2(){
//     System.out.println("Good Afternoon");
//    }
// }
//    abstract class child3 extends child{
//     public void sd(){
//         System.out.println("I am Good!");
//     }
// }
// public class Abstract {
//     public static void main(String[] args) {
//     //   parent p = new parent();
//     //   child3 c = new child3(); .....This show an error becuse this are Abstract class.
//      child p = new child();
//      p.parent2();
//      p.greet();
//      p.greet2();
    
//     }
// }

abstract class shape{
    public int radius, length, breadth;
    shape(int r,int l,int b){
    this.radius = r;
    this.length = l;
    this.breadth = b;
} 
abstract public float circle();
abstract public int square();
abstract public int rectangle();
}

class area extends shape{
  area(int r,int l,int b){
   super(r,l,b);
  }
public float circle(){
    return 3.14f*radius*radius;
}
public int square(){
 return length*length;
}
public int rectangle(){
   return length*breadth;
}
}

public class Abstract {
public static void main(String[] args) {
    area A = new area(3, 5, 6);
    System.out.println("Area of Circle is: "+A.circle());
    System.out.println("Area of Square is: "+A.square());
    System.out.println("Area of rectangle: "+A.rectangle());
}
    
}