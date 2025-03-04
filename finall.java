public class finall {
    public static int great(){
       try{ int a = 50;
        int b = 0;
        int c = a/b;
        return c;
       }
       catch(Exception e){
        System.out.println(e);
       }
       finally{
        System.out.println("I am not depend on return!");
       }
       return -1;
    }
    public static void main(String[] args) {
        int c = great();
        System.out.println(c);
        int a = 5;
        int b = 9;
        while(true){
            try{    
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }

    }
}
