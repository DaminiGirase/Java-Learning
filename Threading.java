class MyTreading1 extends Thread{
    //@Override
   public void run(){
    int i = 0;
        while(i<5){
            System.out.println("Thread 1 chating with her");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class MyTreading2 extends Thread{
    //@Override
   public void run(){
    int i = 0;
        while(i<5){
            System.out.println("Tread 2 is Cooking panipuri");
            System.out.println("I am not happy");
            i++;
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        MyTreading1 sc = new MyTreading1();
        MyTreading2 cs = new MyTreading2();
        sc.start();
        cs.start();
    }
}
