public class methode {
    static int logic(int a, int b){
        int c;
        if(a>b){
            c = a + b;
        }
        else{
            c = (a + b)* 5;
        }
        return c;
    }
   public static void main(String[] args) {
    System.out.println("Program to print method ");
    int x = 2;
    int y = 4;
    // Another way of calling without static
    // method obj = new method();
    // z = obj.logic(x,y)
    int z = logic(x, y);
    int p = 9;
    int q = 8; 
    int r = logic(p, q);
    System.out.println(z);
    System.out.println(r);
   }
    
}
