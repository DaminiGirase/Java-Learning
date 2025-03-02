
// practice Problem 01 creating thread

class car extends Thread{
    public void run(){
        int i = 0;
        while (i<=10) {
            System.out.println("Good Morning"); 
            i++; 
        } 
    }
}
class bike extends Thread{
   public void run(){
    int i = 0;
    while (i<=10) {

        // Practice Problem 02 deleay exicution

        try{
            Thread.sleep(200);
        }
        catch(Exception e){
         System.out.println(e);
        }
        System.out.println("Welcome"); 
        i++;
        }
    }
}
public class threadingPractice {
    public static void main(String[] args) {
        car sc = new car();
        bike cs = new bike();

        // Practice Problem 03 setting priority

        sc.setPriority(9);
        cs.setPriority(8);
        System.out.println(sc.getPriority());
        System.out.println(cs.getPriority());
        //sc.setPriority(Thread.MAX_PRIORITY); --> Another method to set priority

        // Practice Problem 04

        System.out.println(sc.getState());
        System.out.println(Thread.currentThread().getState());
        sc.start();
        cs.start();
       
        

    }
}
