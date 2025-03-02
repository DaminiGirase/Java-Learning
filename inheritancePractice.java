// Practice Problem 01

// class circle{
//     public int radius;
//     circle(int r){
//      this.radius = r;
//     }

//     public double area(){
//       return Math.PI*this.radius*this.radius;
//     }
// }
// class cylinder1 extends circle{
//     public int height;
//     cylinder1(int r,int h){
//         super(r);
//     this.height = h;
//     System.out.println("I am cylinder Constructer");
//     }
//     public double volume(){
//         return Math.PI*this.radius*this.radius*this.height;
//     }

// }
// public class inheritancePractice {
// public static void main(String[] args) {
//     circle sc = new circle(12);
//     cylinder1 cs = new cylinder1(12, 05);
//     sc.area();
//     cs.volume();
//     System.out.println("Area of circle is: "+sc.area());
//     System.out.println("Volume is: "+cs.volume());
// }
    
// }

 // Practice Problem 02

// class rectangle{
//     public int length,breadth;
//     rectangle(int a,int b){
//         this.length = a;
//         this.breadth = b;
//     }
//     public int area(){
//         return this.length*this.breadth;
//     }
// }
// class cuboid extends rectangle{
//     public int height;
//     cuboid(int a,int b,int h){
//       super(a,b);
//       this.height = h;
//     }
//     public int area2(){
//         return 2*this.length+2*this.breadth+2*this.height;
//     }
// }
// public class inheritancePractice {
// public static void main(String[] args) {
//     rectangle sc = new rectangle(3, 4);
//     cuboid cs = new cuboid(4, 5, 6);
//     System.out.println("The Area of Rectangle is: "+ sc.area());
//     System.out.println("The Area of Cuboid is: "+cs.area2());
// }
    
// }

// Practice Problem 03

class rectangle{
    private int length,breadth;
    public int getlength(){
        return length;
    }
    public void setlength(int l){
        this.length = l;
    }

    public int getbreadth(){
        return breadth;
    }
    public void setbreadth(int b){
        this.breadth = b;
    }

    public int area(){
        return length*breadth;
    }

    public int height;
    rectangle(int h){
        this.height = h;
    }
    public int volume(){
        return 2*length+2*breadth+2*height;
    }
}
public class inheritancePractice {
public static void main(String[] args) {
    rectangle sc = new rectangle(4);
   sc.setlength(5);
   System.out.println("Length is: "+ sc.getlength());
   sc.setbreadth(6);
   System.out.println("Breadth is: "+ sc.getbreadth());
   sc.area();
   System.out.println("Area of Rectangle is: "+ sc.area());
   sc.volume();
   System.out.println("Volume of Cuboid is: "+ sc.volume());
}
    
}