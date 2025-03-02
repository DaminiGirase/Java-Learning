// class student{
//     private String name;
//     private int id;
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//        name = n;
//     }
//     public int getId(){
//       return id;
//     }
//     public void setId(int i){
//       id =  i;
//     }
// }
// public class privateClass {
//    public static void main(String[] args) {
//     student sc = new student();
//    sc.setName("Damini Girase"); 
//    System.out.println("Name is: "+sc.getName());
//    sc.setId(241101019);
//    System.out.println("Id is: "+sc.getId());
//    } 
// }

// Square

// class square{
//     public square(int side1, int area1, int perimeter1){
//     side = side1;
//     area = area1;
//     perimeter = perimeter1;
//     }
//   private int side;
//   @SuppressWarnings("unused")
// private int area;
//   @SuppressWarnings("unused")
// private int perimeter;
//   public int getside(){
//     return side;
//   }

//   public void setside(int s){
//     side = s;
//   }

//   public int getarea(){
//        return side*side;
//   }
//   public void setarea(int a){
//       area = a;
//   }
//  public int getperimeter(){
//     return 4*side;
//  }
//  public void setperimeter(int p){
//     perimeter = p;
// }
// }
// public class privateClass {
// public static void main(String[] args) {
//     square sc = new square(8,64,32);
//     // sc.setside(8);
//     System.out.println("Side is: "+sc.getside()); 
//     // sc.setarea(64);
//     System.out.println("Area is: "+sc.getarea());
//     // sc.setperimeter(32);
//     System.out.println("Perimeter is: "+sc.getperimeter());
// }
    
// }

// Overloading with constructers
class teacher{
    public teacher(int s){
       salary = s;
    }
    public teacher(int a, int c){
        salary1 = a;
        salary2 = c;
    }
    private int salary;
    private int salary1;
    private int salary2;
    public int getsalary(){
        return salary;
    }
    public int getsalary1(){
        return salary1;
    }
    public int getsalary2(){
        return salary2;
    }
    
}

public class privateClass {

    public static void main(String[] args) {
        teacher sc = new teacher(45000);
        teacher cs = new teacher(100000,70000);
        System.out.println("salary is: "+sc.getsalary()); 
        System.out.println("salary is: "+cs.getsalary1()); 
        System.out.println("salary is: "+cs.getsalary2()); 
    }
}