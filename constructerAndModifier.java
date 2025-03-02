
// practice problem 01 And 02 And 03

// class cylinder{
//     private int radius;
//     private int height;
//     @SuppressWarnings("unused")
//     private float volume;
//     @SuppressWarnings("unused")
//     private float area;
//     public cylinder(int r, int h){
//       radius = r;
//       height = h;
//     }
//     public int getradius(){
//         return radius;
//     }
//     public void setradius(int r){
//         radius = r;
//     }
//      public int getheight(){
//         return height;
//      }
//      public void setheight(int h){
//        height = h;
//      }
//      public double volume(){
//         return Math.PI *radius*radius*height;
//      }
//      public double area(){
//         return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
//      }
// }
// public class constructerAndModifier {
//     public static void main(String[] args) {
//         cylinder sc = new cylinder(9,12);
//     //    sc.setradius(9);
//        System.out.println("Radius is: "+sc.getradius());
//     //    sc.setheight(12);
//        System.out.println("Height is: "+sc.getheight());
//        System.out.println("Volume is: "+sc.volume());
//        System.out.println("Area is: "+sc.area());
//     }   
// }

// Practice Problem 04

// class rectangle{
//     private int length;
//     private int breadth;
//     public rectangle(int l, int b){
//         length = l;
//         breadth = b;
//     }
//     public int getlength(){
//         return length;
//     }
//     public int getbreadth(){
//         return breadth;
//     }
// }
// public class constructerAndModifier {
//     public static void main(String[] args) {
//         rectangle sc = new rectangle(4, 5);
//         System.out.println("length is: "+sc.getlength()); 
//         System.out.println("breadth is: "+sc.getbreadth());  
//     } 
// }

// practice Problem 05

class sphear{
    private double radius;
    public sphear(double r){
      radius = r;
    }
    public double getradius(){
        return radius;
    }
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    public double volume(){
        return 4/3*Math.PI*radius*radius*radius;
    }

}
public class constructerAndModifier {
public static void main(String[] args) {
    sphear sc = new sphear(4);
    System.out.println("Area is: "+sc.area());
    System.out.println("Volume is: "+sc.volume());
}
    
}