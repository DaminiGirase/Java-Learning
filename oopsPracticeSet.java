// Problem 01

// class empoyee{
//     int salary;
//     String name;
//     String set;

//     public int getsalary(){
//         return salary;
//     }

//     public String getname(){
//         return name;
//     }

//     public String setname(){
//         return set;
//     }
// }
// public class oopsPracticeSet {
//     public static void main(String[] args) {
//         empoyee damini = new empoyee();
//         damini.salary = 12;
//         damini.name = "rajput";
//         damini.set = "Girase";
//         System.out.println("Salary is: " + damini.salary);
//         System.out.println("Name is: " + damini.name);
//         System.out.println("SetName is: " + damini.set);
//     }
    
// }
 
// Problem 02

// class selphon{
//     public void ring(){
//         System.out.println("Ringing.....");
//     }
//     public void vibrat(){
//         System.out.println("Vibrating.....");
//     }
//     public void call(){
//         System.out.println("Calling.....");
//     }
// }
// public class oopsPracticeSet {
//     public static void main(String[] args) {
//         selphon iphone = new selphon();
//         iphone.ring();
//         iphone.vibrat();
//         iphone.call();
//     }
// }

// Problem 03

// class square{
//     int side;
//     int area;
//     int perimeter;
//     public int side1(){
//         return side;
//     }
//     public void area1(){
//        area = side*side;
//        System.out.println(area);
//     }
//     public void perimeter1(){
//         perimeter = 4*side;
//         System.out.println(perimeter);
//     }
// }
// public class oopsPracticeSet {
//     public static void main(String[] args) {
//         square sc = new square();
//        sc.side = 6;
//        System.out.println(sc.side);
//        sc.area1();
//        sc.perimeter1();
//     }
// }

// Practice Problem 04

// class rectangle{
//     int length;
//     int breadth;

//     public int area(){
//         return length*breadth;
//     }

//     public int perimeter(){
//         return 2*(length+breadth);
//     }
// }
// public class oopsPracticeSet {
// public static void main(String[] args) {
//     rectangle rec = new rectangle();
//     rec.length = 4;
//     rec.breadth = 5;
//     System.out.println("Area of Rectangle is: " + rec.area());
//     System.out.println("Perimeter of Rectangle is: " + rec.perimeter());
    
// }
// }

// practice problem 05
// class circle{
//     float radius1;
//     float area1;
//   public float radius(){
//     return radius1;
//   }
//   public float Area5(){
//       return 3.142f*radius1*radius1;
//   }
// }
// public class oopsPracticeSet {
// public static void main(String[] args) {
//     circle sc = new circle();
//     sc.radius1 = 5;
//     System.out.println("radius is :"+sc.radius1);
//     System.out.println("Area of circle is :"+sc.Area5());
// }
    
// }

// Swapping using class
class swap{
    int a = 5;
    int b = 9;
    int temp;
    public void swaping(){
        temp = a;
        a = b;
        b = temp;
        System.out.printf("value of a is: %d\nValue of b is: %d\n",a,b);
    }

    public void Swapping1(){
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.printf("value of a is: %d\nValue of b is: %d\n",a,b);
    }
}

public class oopsPracticeSet {
public static void main(String[] args) {
    swap sc = new swap();
    sc.swaping();
    sc.Swapping1();
}
    
}